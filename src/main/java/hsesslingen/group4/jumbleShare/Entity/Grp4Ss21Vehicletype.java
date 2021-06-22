package hsesslingen.group4.jumbleShare.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

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
    private UUID id;

    @Column(name = "[description]", nullable = false)
    private String description;

    public Grp4Ss21Vehicletype()
    {

    }

    public Grp4Ss21Vehicletype (String description)
    {
        this.id = UUID.randomUUID();
        this.description = description;
    }

}
