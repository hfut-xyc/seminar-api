create database if not exists seminar;
use seminar;

-- ----------------------------
-- 1.Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) not null AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(255) not null COMMENT '用户名',
  `password` varchar(255) not null COMMENT '用户密码',
  `email` varchar(255) DEFAULT NULL COMMENT '用户邮箱',
  primary key (`id`) USING BTREE,
  UNIQUE key uk_username(`username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci;

insert into user(username, password, email) values ('admin', '$2a$10$1X8bXToh5IrujFA/HlQPUOjlIdHv19W47FJnXfjY3bqA.lwi/xSDC', '15141241345');
insert into user(username, password, email) values ('xyc', '$2a$10$JQSlh37uN3Tn96I1dPZYc.Qz59vnIoqXZe/bAqLq4tIO3gsVuMUYW', '151121231');


-- ----------------------------
-- 2.Table structure for report
-- ----------------------------
DROP TABLE IF EXISTS report;
CREATE TABLE report(
  `id` int(11) not null AUTO_INCREMENT COMMENT '用户id',
  `title` varchar(255) not null COMMENT '报告标题',
  `speaker` varchar(255) not null COMMENT '报告人',
  `time` varchar(255) not null COMMENT '报告时间',
  `location` varchar(255) not null COMMENT '报告地点',
  `introduction` varchar(255) default null COMMENT '报告介绍',
  `view` int(11) default 0 COMMENT '浏览量',
  `cid` int(11) default null COMMENT '所属城市',
  `sid` int(11) default null COMMENT '所属学科',
  primary key (`id`) USING BTREE,
  INDEX idx_title(`title`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci;

INSERT INTO report(title, speaker, time, location, cid, sid) VALUES ('工业场景下的隐私保护机器学习', '吴秉哲 苹果学者', '2021-04-24 19:00:00', '清华大学大礼堂', 1, 1);
INSERT INTO report(title, speaker, time, location, cid, sid) VALUES ('从预训练人工神经网络构建脉冲神经网络', '顾实', '2021-04-23 10:00:00', '北京大学理科二号楼2735', 1, 1);
INSERT INTO report(title, speaker, time, location, cid, sid) VALUES ('认知动态系统新进展', '吴启晖教授', '2021-04-17 10:00:00', '同济大学电信楼117', 17, 2);
INSERT INTO report(title, speaker, time, location, cid, sid) VALUES ('面向未来移动通信的PCC极化码和IS-LDPC码', '江涛教授', '2021-04-27 10:00:00', '同济大学电信楼403', 17, 5);
INSERT INTO report(title, speaker, time, location, cid, sid) VALUES ('面向多峰值优化的进化计算方法研究', '詹志辉教授', '2021-04-28 16:00:00', '计算机学院E202会议室', 2, 3);
insert into report(title, speaker, time, location, cid, sid) values('蚂蚁金服大数据应用与实践', '王金龙', '2021年5月17日14：00-15：30', '行政楼二楼报告厅（暂定）', 2, 3);
insert into report(title, speaker, time, location, cid, sid) values('硬件与人工智能结合的全球化机会与案例分享', '陈燎罕，涂鸦科技董事长', '2021年6月15日下午13：30—15：00', '10-420', 3, 4);
insert into report(title, speaker, time, location, cid, sid) values('四论工业信息物理融合系统', 'nan', '2021-10-27（周五）15:00-16:00', '图书馆7楼会议室', 3, 5);
insert into report(title, speaker, time, location, cid, sid) values('信息产业与软件定义', '胡蓓姿，浙江省经信委软件处处长', '4月21日下午14:00-15:30', '行政楼二楼报告厅', 8, 3);
insert into report(title, speaker, time, location, cid, sid) values('CodingTheoryforReliableSignal', 'nan', '2021-4-11（周二）15:00-16:00', '信息学院10-420', 2, 3);
insert into report(title, speaker, time, location, cid, sid) values('CSCW（计算机支持协同工作）研究最新进展——CCF走进高校活动', '顾宁（复旦大学计算机学院）', '2021年12月15日（周四）下午13：30', '2-S143', 2, 4);
insert into report(title, speaker, time, location, cid, sid) values('ScientificandTechnicalChallengesforBuildingNanoSystems', 'DurgamadhabMisra，ElectricalandComputerEngineeringDepartment，NewJerseyInstituteofTechnology,Newark,NJ07102,USA。', '10月25日周二上午10点', '10-420', 4, 3);
insert into report(title, speaker, time, location, cid, sid) values('BinGo:Cross-ArchitectureCross-OSBinarySearch', 'LiuYang,phD,professor', '2021年6月3日（星期四）上午10:00', '10号楼420信息学院会议室',3, 4);
insert into report(title, speaker, time, location, cid, sid) values('密文域信号处理', '张新鹏，上海大学教授、博士生导师、国家杰出青年科学基金获得者。', '12月9日(本周三)下午14:00', '信息学院四楼会议室',2, 1);
insert into report(title, speaker, time, location, cid, sid) values('2021首届高校计算机大赛—人工智能创意赛 赛事启动宣讲会暨人工智能前沿技术交流讲座', 'nan', '2021年6月25日晚上19：00-20：30', '浙江大学玉泉校区计算机科学与技术学院曹光彪东楼502室', 5, 1);
insert into report(title, speaker, time, location, cid, sid) values('[Space, Ground and Human]-driven Information Service for NextGeneration Disaster Response', '董冕雄', '2021年6月7日（周五）14:30-18:00', '东校区信息馆302室', 3, 5);
insert into report(title, speaker, time, location, cid, sid) values('《光纤激光器中的耗散孤子动力学研究》', 'nan', '2021年5月21日（周二）14:00', '东校区信息馆302学术报告厅', 2, 5);
insert into report(title, speaker, time, location, cid, sid) values('安全博弈论及其应用', '王震', '2021年5月24日上午9：30', '信息馆401会议室',2, 4);
insert into report(title, speaker, time, location, cid, sid) values('航天梦的梦想成真与中国的航天精神', '尤睿，中国空间技术研究院总体设计部研究员，“慧眼”号副总指挥', '2021年4月24日上午10：00', '信息馆401会议室', 3, 4);
insert into report(title, speaker, time, location, cid, sid) values('大数据智能与知识图谱', '马宗民', '4月8日（周一）下午4点', '信息馆401', 1, 8);
insert into report(title, speaker, time, location, cid, sid) values('智能感知与智慧医疗', '潘海为', '4月9日（周二）上午10点', '信息馆401',4, 7);
insert into report(title, speaker, time, location, cid, sid) values('Data Parallel Frameworks for Accelerating Machine Learning Algorithms', 'Lixin Gao, University of Massachusetts, Amherst', '3月13日（周三）上午9点', '信息馆401',7, 8);
insert into report(title, speaker, time, location, cid, sid) values('智慧城市服务集成与治理技术研究与应用示范', '何静教授', '3月1日（周五）下午3点', '信息馆401', 9, 8);
insert into report(title, speaker, time, location, cid, sid) values('区块链中的数学模型与技术经济问题', '李泉林', '2021年1月8日15:00', '东校区信息馆401', 1, 5);
insert into report(title, speaker, time, location, cid, sid) values('智能信息流中的机器学习和计算机视觉问题', '单瀛博士', '2021年8月19日 下午14:30', '海韵园行政楼C座505', 1, 8);

-- ----------------------------
-- 3.Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city`(
  `id` int(11) not null AUTO_INCREMENT COMMENT '城市id',
  `name` varchar(255)  not null COMMENT '城市名称',
  primary key (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci;

INSERT INTO `city`(name) VALUES ('北京');
INSERT INTO `city`(name) VALUES ('成都');
INSERT INTO `city`(name) VALUES ('重庆');
INSERT INTO `city`(name) VALUES ('长沙');
INSERT INTO `city`(name) VALUES ('长春');
INSERT INTO `city`(name) VALUES ('大连');
INSERT INTO `city`(name) VALUES ('福州');
INSERT INTO `city`(name) VALUES ('广州');
INSERT INTO `city`(name) VALUES ('桂林');
INSERT INTO `city`(name) VALUES ('哈尔滨');
INSERT INTO `city`(name) VALUES ('杭州');
INSERT INTO `city`(name) VALUES ('合肥');
INSERT INTO `city`(name) VALUES ('济南');
INSERT INTO `city`(name) VALUES ('昆明');
INSERT INTO `city`(name) VALUES ('南京');
INSERT INTO `city`(name) VALUES ('南昌');
INSERT INTO `city`(name) VALUES ('青岛');
INSERT INTO `city`(name) VALUES ('上海');
INSERT INTO `city`(name) VALUES ('深圳');
INSERT INTO `city`(name) VALUES ('苏州');
INSERT INTO `city`(name) VALUES ('天津');
INSERT INTO `city`(name) VALUES ('太原');
INSERT INTO `city`(name) VALUES ('武汉');
INSERT INTO `city`(name) VALUES ('无锡');
INSERT INTO `city`(name) VALUES ('威海');
INSERT INTO `city`(name) VALUES ('西安');
INSERT INTO `city`(name) VALUES ('厦门');


-- ----------------------------
-- 4.Table structure for subject
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject` (
  `id` int(11) not null AUTO_INCREMENT COMMENT '学科id',
  `name` varchar(255) not null COMMENT '学科名称',
  `parent` int(11) default 0 COMMENT '为0表示一级学科，不为0表示所属一级学科id',
  primary key (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci;

INSERT INTO `subject`(name, parent) VALUES ('人工智能', 0);
INSERT INTO `subject`(name, parent) VALUES ('计算机系统', 0);
INSERT INTO `subject`(name, parent) VALUES ('机器学习', 1);
INSERT INTO `subject`(name, parent) VALUES ('数据挖掘', 1);
INSERT INTO `subject`(name, parent) VALUES ('计算机视觉', 1);
INSERT INTO `subject`(name, parent) VALUES ('自然语言处理', 1);
INSERT INTO `subject`(name, parent) VALUES ('智能推荐', 1);
INSERT INTO `subject`(name, parent) VALUES ('计算机体系结构', 2);
INSERT INTO `subject`(name, parent) VALUES ('操作系统', 2);
INSERT INTO `subject`(name, parent) VALUES ('计算机网络', 2);
INSERT INTO `subject`(name, parent) VALUES ('数据库', 2);
INSERT INTO `subject`(name, parent) VALUES ('嵌入式系统', 2);


-- ----------------------------
-- 5.Table structure for user_city
-- ----------------------------
DROP TABLE IF EXISTS `user_city`;
CREATE TABLE `user_city` (
  `id` int(11) not null AUTO_INCREMENT COMMENT '用户关注城市id',
  `uid` int(11) not null COMMENT '用户id',
  `cid` int(11) not null COMMENT '城市id',
  primary key (`id`) USING BTREE,
  unique key idx_uid_cid(`uid`,`cid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci;

insert into `user_city`(uid, cid) values(1, 1);
insert into `user_city`(uid, cid) values(1, 3);
insert into `user_city`(uid, cid) values(2, 1);
insert into `user_city`(uid, cid) values(2, 4);


-- ----------------------------
-- 6.Table structure for user_subject
-- ----------------------------
DROP TABLE IF EXISTS `user_subject`;
CREATE TABLE `user_subject` (
  `id` int(11) not null AUTO_INCREMENT COMMENT '用户关注学科id',
  `uid` int(11) not null COMMENT '用户id',
  `sid` int(11) not null COMMENT '学科id',
  primary key (`id`) USING BTREE,
  unique key idx_uid_sid(`uid`,`sid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci;

insert into `user_subject`(uid, sid) values(1, 1);
insert into `user_subject`(uid, sid) values(1, 2);
insert into `user_subject`(uid, sid) values(1, 3);
insert into `user_subject`(uid, sid) values(2, 4);

-- ----------------------------
-- 7.Table structure for user_report
-- ----------------------------
DROP TABLE IF EXISTS `user_report`;
CREATE TABLE `user_report`  (
  `id` int(11) not null AUTO_INCREMENT COMMENT '用户收藏报告id',
  `uid` int(11) not null COMMENT '用户id',
  `rid` int(11) not null COMMENT '报告id',
  primary key (`id`) USING BTREE,
  unique key idx_uid_rid(`uid`,`rid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci;

insert into `user_report`(uid, rid) values(1, 1);
insert into `user_report`(uid, rid) values(1, 2);
insert into `user_report`(uid, rid) values(2, 3);
insert into `user_report`(uid, rid) values(2, 4);
