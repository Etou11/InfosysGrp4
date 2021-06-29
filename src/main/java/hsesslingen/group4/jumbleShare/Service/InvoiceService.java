package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.JumbleShareApplication;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21TransactionRepository;
import hsesslingen.group4.jumbleShare.Web.Dto.TransactionBookingsDto;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InvoiceService {

    @Autowired
    private TransactionServiceImpl transactionService;

    @Autowired
    private Grp4Ss21TransactionRepository repository;

    public String exportInvoice(String invoiceFormat) throws FileNotFoundException, JRException {
        String pathImer = "C:\\Users\\imer_\\Desktop\\Infosys";
        String pathChris = "D:\\Users\\Chris\\Documents\\Studium Extended\\Semester 5\\Informationssysteme\\Projekt";
        List<TransactionBookingsDto> bookings = transactionService.findTransactionsForBookingsByUserId(JumbleShareApplication._currentlyActiveUser);
        File file = ResourceUtils.getFile("src/main/resources/invoice.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(bookings);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("created By", "jumbleShare");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if(invoiceFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, pathChris+"\\invoice.html");
        }
        if(invoiceFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, pathChris+"\\invoice.pdf");
        }
        return "report generated in path: " + pathChris;
    }

}