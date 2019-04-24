package com.zscat.mallplus.sys.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * https://gitee.com/zscat-platform/mall on 2018/9/30.
 */
public class SysPermissionNode extends SysPermission {
    @Getter
    @Setter
    private List<SysPermissionNode> children;
}
