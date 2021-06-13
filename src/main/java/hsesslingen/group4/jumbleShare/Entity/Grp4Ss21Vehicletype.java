package hsesslingen.group4.jumbleShare.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "Grp_4_SS21_VehicleType")
public class Grp4Ss21Vehicletype implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "[id]", nullable = false)
    private String id;

    @Column(name = "[description]", nullable = false)
    private String description;

}
