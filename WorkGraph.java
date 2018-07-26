import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("481d356a-8462-4b06-9914-61cf2d8a2677")
public class WorkGraph {
    @objid ("574c0426-4eb6-4e19-969a-1c8274594c56")
    public Date startDate;

    @objid ("8a97a5d1-d262-47cf-8997-138a72b8e6a3")
    public List<ProcessInstance> processInstance = new ArrayList<ProcessInstance> ();

    @objid ("58c3529e-5f5b-496b-8c5e-e319b1205b13")
    public List<Actor> actor = new ArrayList<Actor> ();

    @objid ("4d0e3f8a-4672-4933-94d6-89f0f6b25548")
    public List<Task> task = new ArrayList<Task> ();

    @objid ("ee24c639-bef1-4498-abb8-034ac6ad0557")
    public List<Document> document = new ArrayList<Document> ();

    @objid ("de34eeee-3c4e-4e31-9eb8-ec74210a6fe3")
    public List<WorkGraph> subWorkGraph = new ArrayList<WorkGraph> ();

}
