package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.JumbleShareApplication;
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
public class ReportService {

    @Autowired
    private TransactionBookingsDto bookings;

    @Autowired
    private TransactionServiceImpl transactionService;

    public String exportInvoice(String invoiceFormat) throws FileNotFoundException, JRException {
        String path = "C:";
        List<TransactionBookingsDto> bookings = transactionService.findTransactionsForBookingsByUserId(JumbleShareApplication._currentlyActiveUser);
        File file = ResourceUtils.getFile("src/main/resources/invoice.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(bookings);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("created By", "jumbleShare");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if(invoiceFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path+"\\invoice.pdf");
        }
        return "report generated in path: " + path;
    }

}
