package lt.nikas.tobedone;

public interface Endpoint {

    String UUID = "UUID";

    //Todos endpoints
    String TASK = "/tasks/{" + UUID + "}";
    String TASKS = "/tasks";
}
