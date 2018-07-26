import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6fe24743-8e2e-4db4-a3d8-f7ea7e4b8a46")
public class ProcessModel {
    @mdl.prop
    @objid ("2a347b56-97d1-454e-b6af-bac5918eb019")
    private List<Activity> activity = new ArrayList<Activity> ();

    @objid ("a0d14ec1-6a72-4f77-8ba2-09d56d7790f9")
    public List<Artifact> artifact = new ArrayList<Artifact> ();

    @objid ("97de5ca0-0b67-4e96-8093-decf5d5e1f98")
    public List<Role> role = new ArrayList<Role> ();

    @objid ("39e3f3dd-1a2d-4a25-894f-29e60551e090")
    public List<Flow> flow = new ArrayList<Flow> ();

    @objid ("d18a07ab-232c-4dfc-9275-c81b90f3b7e8")
    public List<Gateway> gateway = new ArrayList<Gateway> ();

    @objid ("609146de-0c20-46be-90af-fb3b782694dc")
    public List<Event> event = new ArrayList<Event> ();

    @objid ("d15c7199-2491-46a4-ac55-f0eacc4f3947")
    public List<ProcessInstance> processInstance = new ArrayList<ProcessInstance> ();

}
