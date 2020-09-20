package com.tsien.gateway;

import lombok.Data;

import java.time.LocalTime;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/9/20 0020 18:17
 */

@Data
public class TimeBetweenConfig {

    private LocalTime start;

    private LocalTime end;

}
