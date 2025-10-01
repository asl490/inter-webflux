package com.asl.model.allowedip;

import java.util.UUID;

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
public class AllowedIp {

    private UUID id;
    private String ipAddress;
    private String username;
    private String dniUser;
    private String pcName;
}
