package cn.sz.twoOfGroup.entity;

public class Result<T> {

    private String msg;

    private String Status_Code;

    private T result;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus_Code() {
        return Status_Code;
    }

    public void setStatus_Code(String status_Code) {
        Status_Code = status_Code;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
