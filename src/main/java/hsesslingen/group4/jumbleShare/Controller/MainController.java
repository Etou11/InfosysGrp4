package hsesslingen.group4.jumbleShare.Controller;

import hsesslingen.group4.jumbleShare.Entity.*;
import hsesslingen.group4.jumbleShare.Helper.HelperExtension;
import hsesslingen.group4.jumbleShare.JumbleShareApplication;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21AccountRepository;
import hsesslingen.group4.jumbleShare.Service.*;
import hsesslingen.group4.jumbleShare.Web.Dto.TransactionBookingsDto;
import hsesslingen.group4.jumbleShare.Web.Dto.TripDto;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

@RestController
public class MainController
{
    DbController dbController = new DbController();

    //Service
    @Autowired
    UserServiceImpl userService;
    @Autowired
    VehicleServiceImpl vehicleService;
    @Autowired
    VehicleTypeServiceImpl vehicleTypeService;
    @Autowired
    AccountServiceImp accountService;
    @Autowired
    TransactionServiceImpl transactionService;
    @Autowired
    TripServiceImpl tripService;

    //Repository
    @Autowired
    Grp4Ss21AccountRepository accountRepository;


    //User
    @GetMapping(path = "getUserData")
    List<Grp4Ss21User> getUsers()
    {
        return userService.findAll();
    }

    //Transaction
    @GetMapping(path = "getTransactionBookingsDtosByUserId")
    List<TransactionBookingsDto> getTransactionBookingsDtosByUserId(String userId)
    {
        return transactionService.findTransactionsForBookingsByUserId(JumbleShareApplication._currentlyActiveUser);
    }



    //Trip
    @GetMapping(path = "checkoutVehicle")
    boolean checkoutVehicle(TripDto trip)
    {
        return tripService.checkoutVehicle(trip);
    }

    @GetMapping(path = "checkinVehicle")
    boolean checkinVehicle(TripDto trip)
    {
        return tripService.checkinVehicle(trip);
    }

    @GetMapping(path = "importTrip")
    boolean importTrip(List<TripDto> trips) throws IOException {
        return tripService.importTrips(trips);
    }

    @RequestMapping(path="feedTripData")
    public void setDataInDB() {
        tripService.saveTripData();
    }

    //Account
    @GetMapping(path = "getAccountDetailsByUserId")
    Grp4Ss21Account getAccountDetailsByUserId()
    {
        return accountService.findByUserId(JumbleShareApplication._currentlyActiveUser);
    }

    @GetMapping(path = "updateUserBankDetails")
    boolean updateUserBankDetails(Grp4Ss21Account account)
    {
        var accountToChange = accountService.findByUserId(account.getUserId());
        accountToChange.setOwnerFName(account.getOwnerFName());
        accountToChange.setOwnerLName(account.getOwnerLName());
        accountToChange.setBIC(account.getBIC());
        accountToChange.setIBAN(account.getIBAN());
        accountToChange.setBankName(account.getBankName());

        accountRepository.save(accountToChange);

        return true;
    }


    //Vehicle
    @GetMapping(path = "getVehicleData")
    List<Grp4Ss21Vehicle> getVehicle() { return vehicleService.findAll(); }

    @GetMapping(path = "getVehicleDataForUser")
    List<Grp4Ss21Vehicle> getVehicleByUserId(String userId)
    {
        var vehicles = vehicleService.findAll();
        ArrayList<Grp4Ss21Vehicle> vehiclesFiltered = new ArrayList<Grp4Ss21Vehicle>();

        for (Grp4Ss21Vehicle ele : vehicles)
        {
            if(HelperExtension.UuidEqualityCheck(userId, ele.getUserId().toString()))
                vehiclesFiltered.add(ele);
        }

        return vehiclesFiltered;
    }

    ////Using DeleteMapping leads to spring security refusing connection - GetMapping as a workaround
    @GetMapping(path ="deleteVehicleById")
    boolean deleteVehicleById(String id)
    {
        vehicleService.deleteById(UUID.fromString(id));
        return true;
    }

    //VehicleType
    @GetMapping(path = "getVehicleTypeById")
    Grp4Ss21VehicleType getVehicleTypeById(UUID id) { return vehicleTypeService.getVehicleTypeById(id); }

    @GetMapping(path = "getVehicleTypes")
    List<String> getVehicleTypes() { return dbController.getAllVehicleTypes(); }

    @Autowired
    private InvoiceService service;

    @GetMapping("/invoice/{format}")
    public String generateInvoice(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportInvoice(format);
    }
}
