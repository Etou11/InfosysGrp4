package hsesslingen.group4.jumbleShare.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

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
    private UUID id;

    @Column(name = "[value]", nullable = false)
    private BigDecimal value;

    @Column(name = "[description]", nullable = false)
    private String description;

    @Column(name = "[tripid]", nullable = false)
    private UUID tripId;

}
