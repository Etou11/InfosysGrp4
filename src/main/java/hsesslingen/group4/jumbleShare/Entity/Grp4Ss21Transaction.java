package hsesslingen.group4.jumbleShare.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "Grp_4_SS21_Transaction")
public class Grp4Ss21Transaction implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "[id]", nullable = false)
    private String id;

    @Column(name = "[value]", nullable = false)
    private BigDecimal value;

    @Column(name = "[description]", nullable = false)
    private String description;

    @Column(name = "[transactiondate]", nullable = false)
    private Date transactionDate;

    @Column(name = "[accoutidsender]", nullable = false)
    private String accountIdSender;

    @Column(name = "[accountidreceiver]", nullable = false)
    private String accountIdReceiver;

    @Column(name = "[tripid]", nullable = false)
    private String tripId;

}
