-- 数据库脚-- 数据库脚本
DROP DATABASE IF EXISTS  scss;
CREATE DATABASE scss DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

use scss;

CREATE TABLE course
(
  id bigint(19) PRIMARY KEY COMMENT '唯一标识',
  name VARCHAR(80) NOT NULL COMMENT '课程名称',
  teacher VARCHAR(30) NOT NULL COMMENT '任课老师',
  intro VARCHAR(200) COMMENT '课程简介',
  service_teacher VARCHAR(30) NOT NULL COMMENT '班主任',
  service_teacher_tel VARCHAR(20) NOT NULL COMMENT '班主任电话',
  begin_teach_time DATETIME  COMMENT '开始上课时间',
  end_teach_time DATETIME  COMMENT '结束上课时间',
  begin_select_time DATETIME  COMMENT '开始选课时间',
  end_select_time DATETIME  COMMENT '结束选课时间',
  classroom VARCHAR(20) NOT NULL COMMENT '教室',
  max_amount int(4) DEFAULT 30 NOT NULL COMMENT '上课人数上限',
  current_amount int(4) DEFAULT 0 NOT NULL COMMENT '当前已选人数',
  credit int(2) DEFAULT 3 NOT NULL COMMENT '学分',
  status CHAR(2) DEFAULT 'AC' NOT NULL COMMENT '状态：AC可选；CM完成；PS备选'
);
CREATE TABLE cadre
(
  id bigint (19) PRIMARY KEY,
  name VARCHAR (80) NOT NULL,
  work_number VARCHAR (80) NOT NULL,
  gender VARCHAR (20) NOT NULL,
  cadres_tel VARCHAR (20) NOT NULL,
  email VARCHAR (80) NOT NULL,

)

INSERT INTO course VALUES
(1,'Java初级','刘小亮','','聂空','13322233333','2017-12-10 14:30:00','2017-12-10 16:00:00','2017-11-25 00:00:00','2017-12-05 23:59:59','218',50,0,3,'CM'),
(2,'数学趣谈','赵述','','聂空','13322233333','2018-02-01 14:30:00','2018-02-01 16:00:00','2018-01-15 00:00:00','2018-01-25 23:59:59','218',50,0,3,'AC'),
(3,'周易浅析','任仙','','聂空','13322233333','2018-01-25 10:30:00','2018-01-25 12:00:00','2018-01-05 00:00:00','2018-01-15 23:59:59','212',150,0,5,'AC'),
(4,'中国近代史1','王永忠','','余远','18322283382','2018-02-02 13:00:00','2018-02-02 16:00:00','2018-01-15 00:00:00','2018-02-01 23:59:59','1018',30,0,2,'AC'),
(5,'马克思的一生','张传国','','余远','18322283382','2018-01-31 14:30:00','2018-01-31 16:00:00','2018-01-15 00:00:00','2018-02-03 23:59:59','218',50,0,3,'PS'),
(6,'当代经济','刘方才','','聂空','13322233333','2018-01-28 09:30:00','2018-01-28 12:00:00','2018-01-10 00:00:00','2018-01-25 23:59:59','2018',30,0,2,'PS'),
(7,'宋诗','方会','','余远','18322283382','2018-02-10 14:30:00','2018-02-10 16:00:00','2018-01-25 00:00:00','2018-02-05 23:59:59','218',50,0,3,'PS'),
(8,'唐宋八大家','常彬','','余远','18322283382','2018-02-11 14:30:00','2018-02-11 16:00:00','2018-01-25 00:00:00','2018-02-05 23:59:59','218',50,0,3,'PS'),
(9,'Java中级','李成','','余远','18322283382','2018-03-10 14:30:00','2018-03-10 16:00:00','2018-02-15 00:00:00','2018-03-02 23:59:59','218',50,0,3,'PS'),
(10,'明清经济社会形态','封鹏','','聂空','13322233333','2018-03-05 14:30:00','2018-03-05 16:00:00','2018-01-25 00:00:00','2018-02-20 23:59:59','218',50,0,3,'PS'),
(11,'法律与生活','蒯艳','','聂空','13322233333','2018-02-15 14:30:00','2018-02-15 16:00:00','2018-01-25 00:00:00','2018-02-10 23:59:59','218',50,0,3,'PS'),
(12,'Java高级','徐文广','','聂空','13322233333','2018-02-17 14:30:00','2018-02-17 16:00:00','2018-01-25 00:00:00','2018-02-12 23:59:59','218',50,0,3,'PS'),
(13,'考古故事','钱贡要','','聂空','13322233333','2018-02-19 14:30:00','2018-02-19 16:00:00','2018-01-25 00:00:00','2018-02-13 23:59:59','218',50,0,3,'PS'),
(14,'书法入门','赵引','','余远','18322283382','2018-04-10 14:30:00','2018-04-10 16:00:00','2018-03-15 00:00:00','2018-04-05 23:59:59','218',50,0,3,'PS'),
(15,'计算机的维修','房可','','余远','18322283382','2018-04-15 14:30:00','2018-04-15 16:00:00','2018-03-30 00:00:00','2018-04-10 23:59:59','218',50,0,5,'PS'),
(16,'隶书','吴悬','','余远','18322283382','2018-04-02 14:30:00','2018-04-02 16:00:00','2018-03-15 00:00:00','2018-03-28 23:59:59','2018',50,0,2,'PS'),
(17,'大脑的保养','孙一顺','','余远','18322283382','2018-02-01 14:30:00','2018-02-01 16:00:00','2018-01-15 00:00:00','2018-02-05 23:59:59','218',50,0,3,'PS'),
(18,'利己主意者宣言','刘欣','','余远','18322283382','2018-02-02 14:30:00','2018-02-02 16:00:00','2018-01-15 00:00:00','2018-02-05 23:59:59','218',50,0,3,'PS'),
(19,'互联网的前瞻','周先','','余远','18322283382','2018-02-03 14:30:00','2018-02-03 16:00:00','2018-01-15 00:00:00','2018-02-05 23:59:59','218',50,0,2,'PS'),
(20,'英文口语提高','胡娟','','余远','18322283382','2018-03-10 14:30:00','2018-03-10 16:00:00','2018-02-25 00:00:00','2018-03-07 23:59:59','218',50,0,1,'PS');

commit;本