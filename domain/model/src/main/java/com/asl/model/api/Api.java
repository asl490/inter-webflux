package com.asl.model.api;

import java.util.UUID;

import com.asl.model.enums.Method;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Api {

    private UUID id;
    private String name;
    private String url;
    private Method method;
    private String description;
}
