package lt.nikas.tobedone;

public interface Endpoint {

    String UUID = "UUID";

    //Todos endpoints
    String TASK = "/tasks/{" + UUID + "}";
    String TASKS = "/tasks/";
    String DELETE_TASK = "/tasks/delete/{" + UUID + "}";
    String DELETE_COMPLETED = "/tasks/deletecompleted/";
}
