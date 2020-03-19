package com.tb.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/8 17:44
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {
  private Long id;
  private String serial;
}
