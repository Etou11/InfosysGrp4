package hsesslingen.group4.jumbleShare.Web.Dto;

import java.util.UUID;

public class VehicleTypeDto
{
    private String description;
    private String id;

    public VehicleTypeDto (String description)
    {
        super();
        this.description = description;
    }

    public VehicleTypeDto ()
    {

    }

    public VehicleTypeDto (String id, String description)
    {
        this.id = id;
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
