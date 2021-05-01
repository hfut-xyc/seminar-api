create database if not exists seminar;
use seminar;

-- ----------------------------
-- 1.Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(255) NOT NULL COMMENT '用户名',
  `password` varchar(255) NOT NULL COMMENT '用户密码',
  `email` varchar(255) DEFAULT NULL COMMENT '用户邮箱',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY uk_username(`username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci;

INSERT INTO `user` VALUES (1, 'admin', 'admin', '11111@qq.com');
INSERT INTO `user` VALUES (2, 'xxx', 'xxx', '22222@qq.com');


-- ----------------------------
-- 2.Table structure for report
-- ----------------------------
DROP TABLE IF EXISTS `report`;
CREATE TABLE `report`(
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `title` varchar(255)  NOT NULL COMMENT '报告标题',
  `speaker` varchar(255)  NOT NULL COMMENT '报告人',
  `time` datetime NOT NULL COMMENT '报告时间',
  `location` varchar(255)  NOT NULL COMMENT '报告地点',
  `cid` int(11) NOT NULL COMMENT '所属城市',
  `sid` int(11) NOT NULL COMMENT '所属学科',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_title`(`title`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci;

INSERT INTO `report` VALUES (1, '工业场景下的隐私保护机器学习', '吴秉哲 苹果学者', '2021-04-24 19:00:00', '清华大学大礼堂', 1, 1);
INSERT INTO `report` VALUES (2, '从预训练人工神经网络构建脉冲神经网络', '顾实', '2021-04-23 10:00:00', '北京大学理科二号楼2735', 1, 3);
INSERT INTO `report` VALUES (3, '认知动态系统新进展', '吴启晖教授', '2021-04-17 10:00:00', '同济大学电信楼117', 2, 2);
INSERT INTO `report` VALUES (4, '面向未来移动通信的PCC极化码和IS-LDPC码', '江涛教授', '2021-04-27 10:00:00', '同济大学电信楼403', 2, 2);
INSERT INTO `report` VALUES (5, '面向多峰值优化的进化计算方法研究', '詹志辉教授', '2021-04-28 16:00:00', '计算机学院E202会议室', 3, 2);

-- ----------------------------
-- 3.Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '城市id',
  `name` varchar(255)  NOT NULL COMMENT '城市名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci;

INSERT INTO `city` VALUES (1, '北京');
INSERT INTO `city` VALUES (2, '上海');
INSERT INTO `city` VALUES (3, '广州');
INSERT INTO `city` VALUES (4, '合肥');


-- ----------------------------
-- 4.Table structure for subject
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学科id',
  `name` varchar(255)  NOT NULL COMMENT '学科名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci;

INSERT INTO `subject` VALUES (1, '机器学习');
INSERT INTO `subject` VALUES (2, '数据挖掘');
INSERT INTO `subject` VALUES (3, '计算机视觉');
INSERT INTO `subject` VALUES (4, '自然语言处理');
INSERT INTO `subject` VALUES (5, '计算机体系结构');
INSERT INTO `subject` VALUES (6, '操作系统');
INSERT INTO `subject` VALUES (7, '计算机网络');
INSERT INTO `subject` VALUES (8, '数据库');
INSERT INTO `subject` VALUES (9, '嵌入式系统');
INSERT INTO `subject` VALUES (10, '软件工程');

-- ----------------------------
-- 5.Table structure for user_city
-- ----------------------------
DROP TABLE IF EXISTS `user_city`;
CREATE TABLE `user_city`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户关注城市id',
  `uid` int(11) NOT NULL COMMENT '用户id',
  `cid` int(11) NOT NULL COMMENT '城市id',
  PRIMARY KEY (`id`) USING BTREE,
	KEY idx_uid(`uid`) USING BTREE 
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci;

insert into `user_city` values(1, 1, 1);
insert into `user_city` values(2, 1, 3);
insert into `user_city` values(3, 2, 1);
insert into `user_city` values(4, 2, 4);


-- ----------------------------
-- 6.Table structure for user_subject
-- ----------------------------
DROP TABLE IF EXISTS `user_subject`;
CREATE TABLE `user_subject`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户关注学科id',
  `uid` int(11) NOT NULL COMMENT '用户id',
  `sid` int(11) NOT NULL COMMENT '学科id',
  PRIMARY KEY (`id`) USING BTREE,
	KEY idx_uid(`uid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci;

insert into `user_subject` values(1, 1, 1);
insert into `user_subject` values(2, 1, 2);
insert into `user_subject` values(3, 1, 3);
insert into `user_subject` values(4, 2, 4);

-- ----------------------------
-- 7.Table structure for user_report
-- ----------------------------
DROP TABLE IF EXISTS `user_report`;
CREATE TABLE `user_report`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户收藏报告id',
  `uid` int(11) NOT NULL COMMENT '用户id',
  `rid` int(11) NOT NULL COMMENT '报告id',
  PRIMARY KEY (`id`) USING BTREE,
  KEY idx_uid(`uid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci;


insert into `user_report` values(1, 1, 1);
insert into `user_report` values(2, 1, 2);
insert into `user_report` values(3, 2, 3);
insert into `user_report` values(4, 2, 4);
