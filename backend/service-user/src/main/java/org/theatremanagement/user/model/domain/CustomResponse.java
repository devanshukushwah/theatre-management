package org.theatremanagement.user.model.domain;


import lombok.Builder;
import lombok.Data;

@Data
public class CustomResponse<T> {
    private boolean success;
    private T data;
    private Object error;
}
