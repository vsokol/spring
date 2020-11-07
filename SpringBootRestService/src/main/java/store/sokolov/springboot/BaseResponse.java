package store.sokolov.springboot;

/** базовый ответ */
public class BaseResponse {
    final private String status;
    final private Integer code;

    public BaseResponse(String status, Integer code) {
        this.status = status;
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public Integer getCode() {
        return code;
    }
}
