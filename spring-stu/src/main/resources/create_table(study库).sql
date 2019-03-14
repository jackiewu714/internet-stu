
-- DROP TABLE IF EXISTS `tb_sm_login_log`;

CREATE TABLE `tb_sm_login_log` (
                                 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                 `user_name` varchar(32) DEFAULT NULL COMMENT '用户名称',
                                 `yyuid` bigint(20) DEFAULT NULL COMMENT 'yyuid',
                                 `yyid` varchar(32) DEFAULT NULL COMMENT 'yyid',
                                 `staff_id` int(11) DEFAULT NULL COMMENT '工号ID',
                                 `sys` varchar(32) DEFAULT NULL COMMENT '系统标识',
                                 `ip` varchar(32) DEFAULT NULL COMMENT 'ip地址',
                                 `mac` varchar(32) DEFAULT NULL COMMENT 'mac地址',
                                 `cre_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
                                 PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;