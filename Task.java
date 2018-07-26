import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("61f61dfc-11a9-44c3-af59-428f3d861e94")
public class Task {
    @objid ("41668ac2-d2c7-4e33-828b-4ed5c19b7bf3")
    public Date planDate;

    @objid ("a97fec78-c556-4b9f-8bbb-17a396125cea")
    public Date startDateDate;

    @objid ("58f6dc73-03e4-44f5-bb97-d61e76dedebe")
    public Date completeDate;

    @objid ("b8346e47-c258-4d33-af06-06a4af748d15")
    public String title;

    @objid ("a1726167-abfa-4cee-bc3b-482da654c841")
    public String description;

    @objid ("68587285-4734-4523-ab10-b2e8c841bd87")
    public Activity[] implementedActivity;

}
