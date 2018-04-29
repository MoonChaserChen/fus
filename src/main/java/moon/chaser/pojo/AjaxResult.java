package moon.chaser.pojo;

/**
 * Created by Allen on 2018/4/29.
 */
public class AjaxResult {
    private int status;
    private String message;
    private Object data;

    public AjaxResult() {
    }

    public AjaxResult(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public AjaxResult(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
