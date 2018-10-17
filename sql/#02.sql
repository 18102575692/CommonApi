-- 用户表
CREATE TABLE `common_api`.`user` (
  `user_id` VARCHAR(18) NOT NULL COMMENT '用户ID',
  `username` VARCHAR(45) NOT NULL COMMENT '用户名字',
  `password` VARCHAR(45) NOT NULL COMMENT '用户密码',
  `user_type` INT NOT NULL DEFAULT 0 COMMENT '用户类型',
  `phone` VARCHAR(12) NULL COMMENT '手机号码',
  PRIMARY KEY (`user_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

ALTER TABLE `common_api`.`user`
  ADD COLUMN `created_time` INT NOT NULL COMMENT '创建时间' AFTER `phone`,
  ADD COLUMN `updated_time` INT NOT NULL COMMENT '更新时间' AFTER `created_time`;
ALTER TABLE `common_api`.`user`
  ADD COLUMN `state` INT NOT NULL DEFAULT 0 COMMENT '用户状态 0：正常  1：停用' AFTER `updated_time`;

