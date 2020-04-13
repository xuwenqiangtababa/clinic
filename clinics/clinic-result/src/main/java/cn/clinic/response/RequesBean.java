package cn.clinic.response;

import java.io.Serializable;

public class RequesBean implements Serializable {
    private Integer code;
    private String msg;
    private Object data;

    public  static RequesBean ok(){
        return new RequesBean(200,"success",null);
    }

    public  static RequesBean ok(Object obj){
        return new RequesBean(200,"success",obj);
    }
    public  static RequesBean error(){
        return new RequesBean(500,"error",null);
    }
    public  static RequesBean error(String msg){
        return new RequesBean(500,msg,null);
    }
    private RequesBean(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
