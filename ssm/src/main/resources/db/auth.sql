
CREATE TABLE AUTH_APPENDDATA
(
   ID                   char(19) not null,
   VISITOR_ID           char(19) not null,
   VISITOR_CODE         varchar(300),
   RESOURCE_ID          char(19),
   AUTHORIZE_ID         char(19),
   APPEND_VALUE         varchar(300),
   CREATE_DATE          datetime not null,
   primary key (ID)
) engine=INNODB COMMENT='追加数据表';


CREATE TABLE AUTH_AUTHORIZE
(
   ID                   char(19) not null,
   VISITOR_ID           char(19) not null,
   VISITOR_CODE         varchar(300),
   VISITOR_TYPE         char(1),
   RESOURCE_ID          char(19) not null,
   RESOURCE_CODE        varchar(300),
   RESOURCE_TYPE        char(1),
   AUTHORIZE_STATUS     char(1) not null default '1' comment '0拒绝,1接受',
   ACCESS_TYPE          numeric(8,0),
   IS_APPEND            char(1) not null default '0' comment '0没有,1有',
   CREATE_DATE          datetime not null,
   MODIFY_DATE          datetime,
   SYSTEM_ID        varchar(300),
   primary key (ID)
) engine=INNODB COMMENT='授权表';

CREATE TABLE AUTH_AUTHORIZE_LOG
(
   ID                   char(19) not null,
   OPERATE_DATE         datetime,
   OPERATE_ID           char(19),
   OPERATE_NAME         varchar(300),
   OPERATE_TYPE         char(19),
   VISITOR_ID           char(19) not null,
   VISITOR_NAME         varchar(300),
   VISITOR_CODE         varchar(300),
   VISITOR_TYPE         char(1),
   RESOURCE_ID          char(19) not null,
   RESOURCE_NAME        varchar(300),
   RESOURCE_CODE        varchar(300),
   RESOURCE_TYPE        char(1),
   AUTHORIZE_STATUS     char(1) not null default '1' comment '0拒绝,1接受',
   AUTHORIZE_TAG        char(19),
   ACCREDIT_TYPE        char(1) not null default '0' comment '0：授权，1：代理',
   ACCESS_TYPE          numeric(8,0),
   IS_APPEND            char(1) not null default '0' comment '0没有,1有',
   CREATE_DATE          datetime not null,
   MODIFY_DATE          datetime,
   DELETE_DATE          datetime,
   primary key (ID)
) engine=INNODB COMMENT='授权日志表';

CREATE TABLE AUTH_TENANT
(
   ID                   char(19) not null,
   TENANT_CODE          varchar(50),
   TENANT_NAME          varchar(300),
   TENANT_SHORT_NAME    varchar(300),
     TENANT_FLAG          varchar(50),
   TENANT_TYPE          varchar(50),
   REMARK               varchar(1000),
   ENABLE_STATUS        char(1) not null default '1' comment '0禁用,1启用',
   ENABLE_DATE          datetime,
   CREATE_DATE          datetime not null,
   MODIFY_DATE          datetime,
   COLUMN1              varchar(300),
   COLUMN2              varchar(300),
   COLUMN3              varchar(300),
   primary key (ID)
) engine=INNODB COMMENT='租户表';

CREATE TABLE AUTH_COMPANY
(
   ID                   char(19) not null,
   COMPANY_NO           varchar(50),
   COMPANY_NAME         varchar(300),
   COMPANY_FLAG         varchar(50),
   COMPANY_TYPE         varchar(50),
   COMPANY_LEVEL        varchar(3),
   SHORT_NAME           varchar(50),
   AREA                 varchar(50),
   LINKMAN              varchar(50),
   TEL                  varchar(50),
   FAX                  varchar(50),
   ADDRESS              varchar(300),
   POSTALCODE           varchar(50),
   EMAIL                varchar(300),
   WEB                  varchar(300),
   REMARK               varchar(1000),
   ENABLE_STATUS        char(1) not null default '1' comment '0禁用,1启用',
   ENABLE_DATE          datetime,
   CREATE_DATE          datetime not null,
   MODIFY_DATE          datetime,
   COLUMN1              varchar(300),
   COLUMN2              varchar(300),
   COLUMN3              varchar(300),
   primary key (ID)
) engine=INNODB COMMENT='单位表';

CREATE TABLE AUTH_DEPARTMENT
(
   ID                   char(19) not null,
   DEPT_NO              varchar(50),
   DEPT_NAME            varchar(300),
   DEPT_FLAG            varchar(50),
   DEPT_TYPE            varchar(50),
   DEPT_LEVEL           varchar(3),
   DEPT_LEADER          varchar(50),
   REMARK               varchar(1000),
   ENABLE_STATUS        char(1) not null default '1' comment '0禁用,1启用',
   ENABLE_DATE          datetime,
   CREATE_DATE          datetime not null,
   MODIFY_DATE          datetime,
   COLUMN1              varchar(300),
   COLUMN2              varchar(300),
   COLUMN3              varchar(300),
   primary key (ID)
) engine=INNODB COMMENT='部门表';

CREATE TABLE AUTH_POSITION
(
   ID                   char(19) not null,
   POSITION_NO          varchar(50),
   POSITION_NAME        varchar(50),
   POSITION_FLAG        varchar(50),
   POSITION_TYPE        varchar(50),
   POSITION_LEVEL       varchar(3),
   LEADER_FLAG          char(1) not null default '0' comment '0非领导,1领导',
   LEADER_LEVEL         varchar(50),
   REMARK               varchar(1000),
   ENABLE_STATUS        char(1) not null default '1' comment '0禁用,1启用',
   ENABLE_DATE          datetime,
   CREATE_DATE          datetime not null,
   MODIFY_DATE          datetime,
   COLUMN1              varchar(300),
   COLUMN2              varchar(300),
   COLUMN3              varchar(300),
   primary key (ID)
) engine=INNODB COMMENT='岗位表';

CREATE TABLE AUTH_EMPLOYEE
(
   ID                   char(19) not null,
   PERSON_NO            varchar(50),
   PERSON_NAME          varchar(50),
   ENGLISH_NAME         varchar(50),
   PERSON_TYPE          varchar(50) comment '0其他从业人员,1正式员工',
   SEX                  char(1) comment '0女 1男',
   MOBILE               varchar(50),
   TEL                  varchar(50),
   EMAIL                varchar(300),
   ADDRESS              varchar(300),
   POSTALCODE           varchar(50),
   REMARK               varchar(1000),
   ENABLE_STATUS        char(1) not null default '1' comment '0禁用,1启用',
   ENABLE_DATE          datetime,
   CREATE_DATE          datetime not null,
   MODIFY_DATE          datetime,
   COLUMN1              varchar(300),
   COLUMN2              varchar(300),
   COLUMN3              varchar(300),
   primary key (ID)
) engine=INNODB COMMENT='员工表';

CREATE TABLE AUTH_USER
(
   ID                   char(19) not null,
   GROUP_ID             char(19),
   LOGIN_ID             varchar(50),
   PASSWORD             varchar(50),
   PWD_QUESTION         varchar(300),
   PWD_ANSWER           varchar(300),
   NAME                 varchar(50),
   IS_ADMIN             char(1) not null default '0' comment '0普通用户,1系统管理员,2某公司业务管理员',
   AGENT_STATUS         char(1) not null default '0' comment '0没有代理别人,1正在代理别人',
   EMAIL                varchar(300),
   LOGIN_IP             varchar(50),
   ENABLE_STATUS        char(1) not null default '1' comment '0禁用,1启用',
   ENABLE_DATE          datetime,
   AUDIT_FLAG           char(1),
   AUDIT_USER           char(19),
   AUDIT_TIME           datetime,
   CREATE_USER          char(19),
   CREATE_DATE          datetime not null,
   MODIFY_USER          char(19),
   MODIFY_DATE          datetime,
   LOGIN_DATE           datetime,
   RETIRE_DATE          datetime,
   SYSTEM_CODE          varchar(50),
   FAILED_TIMES         numeric(8,0),
   primary key (ID)
) engine=INNODB COMMENT='用户表';


-- 用户登录ID唯一索引
CREATE unique INDEX IDX_USER_LOGINID ON AUTH_USER
(
   LOGIN_ID
) ;


CREATE TABLE AUTH_CONNECTRULE
(
   ID                   char(19) not null,
   RELATION_TYPE_ID     char(19),
   PARENT_GROUPTYPE_ID  char(19),
   CHILD_GROUPTYPE_ID   char(19),
   NAME                 varchar(300) not null,
   CREATE_DATE          datetime not null,
   MODIFY_DATE          datetime,
   REMARK               varchar(1000),
   primary key (ID)
) engine=INNODB COMMENT='连接规则表';


CREATE TABLE AUTH_FUNCTREE
(
   ID                   char(19) not null,
   TYPE                 char(1) not null comment '0功能菜单,2页面按钮',
   NAME                 varchar(50),
   KEYWORD              varchar(50),
   HOT_KEY              varchar(50),
   URL                  varchar(1000),
   CODE                 varchar(300),
   PARENT_CODE          varchar(300),
   TOTAL_CODE           varchar(300) not null,
   TREE_LEVEL           numeric(3,0),
   ORDER_CODE           varchar(300),
   HELP                 varchar(300),
   IS_LEAF              char(1) not null default '0' comment '0不是,1是',
   TYPE_IS_LEAF         char(1) not null default '0' comment '0不是,1是',
   SYSTEM_ID            varchar(300),
   TREE_ID            varchar(300),
   ENABLE_STATUS        char(1) not null default '1' comment '0禁用,1启用',
   ENABLE_DATE          datetime,
   CREATE_DATE          datetime not null,
   MODIFY_DATE          datetime,
   IS_SSL                char(1) comment '0表示禁用,1表示启用',
   IS_PUBLIC            char(1),
   primary key (ID)
) engine=INNODB COMMENT='功能树表';


CREATE TABLE AUTH_HISTORY
(
   ID                   char(19) not null,
   OPERATE_DATE         datetime,
   OPERATE_ID           char(19),
   OPERATE_NAME         varchar(300),
   OPERATE_TYPE         varchar(19),
   SOURCE_ID            char(19),
   SOURCE_CODE          varchar(300),
   SOURCE_NAME          varchar(300),
   SOURCE_ORGTREE       varchar(300),
   SOURCE_DETAIL        text,
   SOURCE_TYPEID        char(19),
   TAG_ID               char(19),
   TAG_USERID           char(19),
   TAG_DATE             datetime,
   CLOUMN1              varchar(300),
   CLOUMN2              varchar(300),
   CLOUMN3              varchar(300),
   SOURCE_GROUPID       char(19),
   DEST_ID              char(19),
   DEST_CODE            varchar(300),
   DEST_NAME            varchar(300),
   DEST_ORGTREE         varchar(300),
   primary key (ID)
) engine=INNODB;

CREATE TABLE AUTH_LOGIN_LOG
(
   ID                   char(19) not null,
   LOGIN_ID             varchar(50),
   NAME                 varchar(50),
   LOGIN_IP             varchar(50),
   GROUP_ID             char(19),
   IE                   varchar(50),
   OS                   varchar(50),
   HOST                 varchar(50),
   LOGOUT_TYPE          char(1),
   LOGIN_TIME           datetime,
   LOGOUT_TIME          datetime,
   LOGIN_STATE          varchar(300) default '0',
   LOCK_TIME            datetime,
   LOGIN_MAC            varchar(50),
   primary key (ID)
) engine=INNODB COMMENT='登录日志表';


CREATE TABLE AUTH_GROUP
(
   ID                   char(19) not null,
   GROUPTYPE_ID         char(19) not null,
   GROUPTYPE_KEYWORD    char(1),
   IS_INHERIT           char(1) not null default '1' comment '0不继承权限,1继承权限',
   IS_REAL              char(1) not null default '1' comment '0虚拟团体,1真实团体',
   NAME                 varchar(300),
   EMAIL                varchar(300),
   OWNER_ORG            varchar(300),
   REMARK               varchar(1000),
   ENABLE_STATUS        char(1) not null default '1' comment '0禁用,1启用',
   ENABLE_DATE          datetime,
   CREATE_DATE          datetime not null,
   MODIFY_DATE          datetime,
   primary key (ID)
) engine=INNODB COMMENT='团体表';

CREATE TABLE AUTH_GROUPRELATION
(
   ID                   char(19) not null,
   RELATIONTYPE_ID      char(19),
   RELATIONTYPE_KEYWORD varchar(500) comment '废弃',
   PARENT_CODE          varchar(300),
   PARENT_GROUPID       char(19),
   GROUPID              char(19),
   CODE                 varchar(300),
   NAME                 varchar(300),
   GROUPTYPE_ID         varchar(19),
   TYPE_LEVEL           numeric(3,0),
   ORDER_CODE           varchar(300),
   IS_LEAF              char(1) not null default '0' comment '0不是叶子节点,1是叶子节点',
   TYPE_IS_LEAF         char(1) not null default '0' comment '0在本类型内不是叶子节点,1在本类型内是叶子节点',
   IS_INHERIT           char(1) not null default '1' comment '0不继承权限,1继承权限',
   IS_CHIEF             char(1) not null default '1' comment '0非主岗位,1是主岗位',
   EMAIL                varchar(300),
   CREATE_DATE          datetime not null,
   MODIFY_DATE          datetime,
   primary key (ID)
) engine=INNODB COMMENT='团体关系表';

-- 编码索引
CREATE INDEX IDX_PR_PARENTCODE_CHILDCODE ON AUTH_GROUPRELATION
(
   PARENT_CODE,
   CODE
) ;


CREATE TABLE AUTH_GROUPRELATIONTYPE
(
   ID                   char(19) not null,
   NAME                 varchar(300),
   ROOT_GROUPTYPE_ID char(19),
   KEYWORD              char(1) comment '1行政关系,...',
   ENABLE_STATUS        char(1) not null default '1' comment '0禁用,1启用',
   ENABLE_DATE          datetime,
   CREATE_DATE          datetime not null,
   MODIFY_DATE          datetime,
   REMARK               varchar(1000),
   primary key (ID)
) engine=INNODB COMMENT='团体关系类型表';

CREATE TABLE AUTH_GROUPTYPE
(
   ID                   char(19) not null,
   NAME                 varchar(50),
   KEYWORD              char(1) comment '1公司,2部门,3岗位,4员工,...',
   TABLE_NAME           varchar(50),
   CODE_PREFIX          char(1),
   ENABLE_STATUS        char(1) not null default '1' comment '0禁用,1启用',
   ENABLE_DATE          datetime,
   CREATE_DATE          datetime not null,
   MODIFY_DATE          datetime,
   REMARK               varchar(1000),
   primary key (ID)
) engine=INNODB COMMENT='团体类型表';



CREATE TABLE AUTH_PROXY_HISTORY
(
   ID                   char(19) not null,
   PROXY_HISTORY_ID     char(19),
   PROXY_PROXYER_HISTORY_ID char(19),
   PROXY_AUTHORIZE_HISTORY_ID char(19),
   OPERATER_ID          char(19),
   OPERATER_NAME        varchar(300),
   OPERATER_DATE        datetime,
   LOGIN_NAME           varchar(300),
   OPERATER_TYPE        varchar(300),
   NOTICE_NOTE          char(1),
   COLUMN1              varchar(300) default '0',
   SPONSOR              varchar(50),
   SPONSOR_ID           char(19),
   PROXY                varchar(50),
   PROXY_ID             char(19),
   RECIPIENT            varchar(50),
   RECIPIENT_ID         char(19),
   CANEL_ID             char(19),
   CANEL_NAME           varchar(50),
   CANEL_DATE           datetime,
   primary key (ID)
) engine=INNODB COMMENT='代理历史记录表';


CREATE TABLE AUTH_RESOURCE
(
   ID                   char(19) not null,
   RESOURCE_TYPE        char(1),
   IS_PUBLIC            char(1) comment '0受控,1公开',
   ACCESS_TYPE          numeric(8,0),
   NAME                 varchar(300),
   VALUE                varchar(300),
   FILTER_TYPE          varchar(50),
   FIELD_CHINESENAME    varchar(300),
   FIELD_NAME           varchar(300),
   TABLE_CHINESENAME    varchar(300),
   TABLE_NAME           varchar(500),
   GROUP_TYPE           varchar(19),
   HELP                 varchar(1000),
   ENABLE_STATUS        char(1) not null default '1' comment '0禁用,1启用',
   ENABLE_DATE          datetime,
   CREATE_DATE          datetime not null,
   MODIFY_DATE          datetime,
   SYSTEM_ID            varchar(300),
   primary key (ID)
) engine=INNODB COMMENT='资源表';


CREATE TABLE AUTH_SYSERROR
(
   ID                   char(19) not null,
   OPERATE_ID           char(19),
   OPERATE_NAME         varchar(300),
   OPERATE_DATE         datetime,
   ERROR_TYPE           char(1),
   SOURCE_ID            char(19),
   SOURCE_GROUPID       char(19),
   SOURCE_CODE          varchar(300),
   SOURCE_NAME          varchar(300),
   SOURCE_ORGTREE       varchar(300),
   SOURCE_TYPEID        char(19),
   SOURCE_DETAIL        text,
   REMARK               text,
   CLOUMN1              varchar(50),
   primary key (ID)
) engine=INNODB COMMENT='系统错误表';

CREATE TABLE AUTH_SYSPARAS
(
   ID                   char(19) not null,
   PROPERTYKEY          varchar(50),
   VALUE                varchar(100),
   INITTIME             datetime,
   UPDATETIME           datetime,
   CREATORID            char(19),
   CREATORNAME          varchar(50),
   DESCRIPTION          varchar(200),
   CLOUMN1              varchar(50),
   ENABLE               char(1),
   PROPERTYTYPE         char(1) default '0',
   primary key (ID)
) engine=INNODB COMMENT='系统参数表';


CREATE TABLE AUTH_USER_PROFILE
(
   ID                   char(19) not null,
   PROPERTYKEY          varchar(50),
   VALUE                varchar(300),
   INITTIME             datetime,
   UPDATETIME           datetime,
   GROUPID              char(19),
   GROUPNAME            varchar(50),
   DESCRIPTION          varchar(200),
   CLOUMN1              varchar(50),
   ENABLE               char(1),
   PROPERTYTYPE         char(1) default '0',
   primary key (ID)
) engine=INNODB COMMENT='用户属性文件表';


CREATE TABLE AUTH_VISITOR
(
   ID                   char(19) not null,
   ORIGINAL_ID          char(19),
   VISITOR_TYPE         char(1),
   NAME                 varchar(300),
   CODE                 varchar(300),
   GROUPTYPE_ID         char(19),
   GROUPRELATIONTYPE_ID char(19),
   CREATE_DATE          datetime not null,
   MODIFY_DATE          datetime,
   primary key (ID)
) engine=INNODB COMMENT='访客表';

create table AUTH_WORKCALENDAR
(
  ID              CHAR(19) not null,
  PLAN_DATE       datetime,
  PALN_TIME_BEGIN datetime,
  PLAN_TIME_END   datetime,
  PLAN_CONTENT    VARCHAR(2000),
  IS_PRIVATE      CHAR(1),
  GROUP_ID        CHAR(19),
  GROUP_CODE      VARCHAR(300),
  UPDATE_ID       CHAR(19),
  UPDATE_TIME     datetime,
  REPEATE_TIMES   numeric(8,0),
  TYPE            CHAR(1),
  STYLE           VARCHAR(300),
  REMARK          VARCHAR(50),
  ALLDAY          CHAR(1),
  URL             VARCHAR(50),
  EDITABLE        CHAR(1),
  SOURCE          VARCHAR(300),
  JSON_DATA       VARCHAR(2000),
  OP_PERCENT         VARCHAR(4),
  primary key (ID)
)engine=INNODB COMMENT='工作日历表';


CREATE TABLE AUTH_VIRTUALSITE
(
   ID                char(19) not null,
   GROUP_ID          char(19),
   GROUP_CODE        varchar(300),
   SITE_TYPE         char(19),
   SITE_NAME         varchar(50),
   SITE_EXT          varchar(30),
   RESOURCE_ID       char(19),
   REMARK            varchar(300),
   primary key (ID)
) engine=INNODB COMMENT='虚拟站点表';

CREATE TABLE AUTH_VIRTUALSITETYPE
(
   ID                 char(19) not null,
   TYPE_NAME          varchar(50),
   RESOURCEID         char(19),
   REMARK             varchar(300),
   primary key (ID)
) engine=INNODB COMMENT='虚拟站点类型表';


insert into AUTH_GROUPRELATIONTYPE (ID, NAME, KEYWORD, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000400000000001', '行政关系', '3', '1', null, now(), null, null);
insert into AUTH_GROUPRELATIONTYPE (ID, NAME, KEYWORD, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000400000000002', '角色关系', '2', '1', null, now(), null, null);


insert into AUTH_GROUPTYPE (ID, NAME, KEYWORD, TABLE_NAME, CODE_PREFIX, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000500000000000', '租户', '3', null, null, '1', null, now(), null, null);
insert into AUTH_GROUPTYPE (ID, NAME, KEYWORD, TABLE_NAME, CODE_PREFIX, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000500000000001', '公司', '3', null, null, '1', null, now(), null, null);
insert into AUTH_GROUPTYPE (ID, NAME, KEYWORD, TABLE_NAME, CODE_PREFIX, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000500000000002', '部门', '3', null, null, '1', null, now(), null, null);
insert into AUTH_GROUPTYPE (ID, NAME, KEYWORD, TABLE_NAME, CODE_PREFIX, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000500000000003', '岗位', '3', null, null, '1', null, now(), null, null);
insert into AUTH_GROUPTYPE (ID, NAME, KEYWORD, TABLE_NAME, CODE_PREFIX, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000500000000004', '员工', '1', null, null, '1', null, now(), null, null);
insert into AUTH_GROUPTYPE (ID, NAME, KEYWORD, TABLE_NAME, CODE_PREFIX, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000500000000005', '角色', '2', null, null, '1', null, now(), null, null);


insert into AUTH_CONNECTRULE (ID, RELATION_TYPE_ID, PARENT_GROUPTYPE_ID, CHILD_GROUPTYPE_ID, NAME, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000600000000000', '2020000400000000001', '2020000500000000000', '2020000500000000001', '行政关系规则0', now(), null, '租户连接单位');

insert into AUTH_CONNECTRULE (ID, RELATION_TYPE_ID, PARENT_GROUPTYPE_ID, CHILD_GROUPTYPE_ID, NAME, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000600000000001', '2020000400000000001', '2020000500000000001', '2020000500000000001', '行政关系规则1', now(), null, '单位连接单位');
insert into AUTH_CONNECTRULE (ID, RELATION_TYPE_ID, PARENT_GROUPTYPE_ID, CHILD_GROUPTYPE_ID, NAME, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000600000000002', '2020000400000000001', '2020000500000000001', '2020000500000000002', '行政关系规则2', now(), null, '单位连接部门');

insert into AUTH_CONNECTRULE (ID, RELATION_TYPE_ID, PARENT_GROUPTYPE_ID, CHILD_GROUPTYPE_ID, NAME, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000600000000003', '2020000400000000001', '2020000500000000002', '2020000500000000002', '行政关系规则3', now(), null, '部门连接部门');
insert into AUTH_CONNECTRULE (ID, RELATION_TYPE_ID, PARENT_GROUPTYPE_ID, CHILD_GROUPTYPE_ID, NAME, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000600000000004', '2020000400000000001', '2020000500000000002', '2020000500000000003', '行政关系规则4', now(), null, '部门连接岗位');
insert into AUTH_CONNECTRULE (ID, RELATION_TYPE_ID, PARENT_GROUPTYPE_ID, CHILD_GROUPTYPE_ID, NAME, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000600000000005', '2020000400000000001', '2020000500000000002', '2020000500000000004', '行政关系规则5', now(), null, '部门连接员工');

insert into AUTH_CONNECTRULE (ID, RELATION_TYPE_ID, PARENT_GROUPTYPE_ID, CHILD_GROUPTYPE_ID, NAME, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000600000000006', '2020000400000000001', '2020000500000000003', '2020000500000000004', '行政关系规则6', now(), null, '岗位连接员工');

insert into AUTH_CONNECTRULE (ID, RELATION_TYPE_ID, PARENT_GROUPTYPE_ID, CHILD_GROUPTYPE_ID, NAME, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000600000000007', '2020000400000000002', '2020000500000000005', '2020000500000000005', '角色关系规则1', now(), null, '角色连接角色');
insert into AUTH_CONNECTRULE (ID, RELATION_TYPE_ID, PARENT_GROUPTYPE_ID, CHILD_GROUPTYPE_ID, NAME, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000600000000008', '2020000400000000002', '2020000500000000005', '2020000500000000004', '角色关系规则2', now(), null, '角色连接员工');



insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000001', '0', '0', 1, '功能菜单', '101', null, null, '101', null, null, null, '根节点', '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000009', '0', '0', 1, '权限管理', '101002', null, null, null, null, null, null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000010', '0', '0', 1, '用户管理', '101002001', null, null, null, null, '/UserAction.do?cmd=queryAll', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000011', '0', '0', 1, '角色管理', '101002002', null, null, null, null, '/RoleAction.do?cmd=showTree', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000012', '0', '0', 1, '菜单管理', '101002003', null, null, null, null, '/jsp/Authority/Au/Aufunctree/listAuFunctree.jsp', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000013', '0', '0', 1, '授权管理', '101002004', null, null, null, null, null, null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000014', '0', '0', 1, '用户授权', '101002004001', null, null, null, null, '/VisitorAction.do?cmd=queryAllUser', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000015', '0', '0', 1, '角色授权', '101002004002', null, null, null, null, '/VisitorAction.do?cmd=queryAllRole', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000016', '0', '0', 1, '机构授权', '101002004003', null, null, null, null, '/VisitorAction.do?cmd=queryAllOrg', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000017', '0', '0', 1, '资源注册', '101002005', null, null, null, null, null, null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000018', '0', '0', 1, '按钮注册', '101002005001', null, null, null, null, '/jsp/Authority/Au/Aufunctree/listAuFunctree.jsp', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000019', '0', '0', 1, '字段注册', '101002005002', null, null, null, null, '/ResourceAction.do?cmd=queryAllfield', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000020', '0', '0', 1, '记录注册', '101002005003', null, null, null, null, '/ResourceAction.do?cmd=queryAll', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000021', '0', '0', 1, '组织管理', '101003', null, null, null, null, null, null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000022', '0', '0', 1, '组织机构管理', '101003001', null, null, null, null, '/RelationAction.do?cmd=showTree', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000023', '0', '0', 1, '公司档案管理', '101003002', null, null, null, null, '/CompanyAction.do?cmd=queryAll', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000024', '0', '0', 1, '部门档案管理', '101003003', null, null, null, null, '/DepartmentAction.do?cmd=queryAll', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000025', '0', '0', 1, '岗位信息管理', '101003004', null, null, null, null, '/PositionAction.do?cmd=queryAll', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000026', '0', '0', 1, '人员档案管理', '101003005', null, null, null, null, '/EmployeeAction.do?cmd=queryAll', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000027', '0', '0', 1, '组织参照举例', '101003006', null, null, '101003006', null, '/jsp/Authority/tree/orgTreeExample.jsp', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000031', '0', '0', 1, '历史日志管理', '101003007', null, null, '101003007', null, '/HistoryLogAction.do?cmd=simpleQuery', null, null, '1', null, now(), null);



insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000028', '0', '0', 1, '在线用户管理', '101002006', null, null, null, null, '/jsp/login/onlineUserList.jsp', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000029', '0', '0', 1, '登录日志管理', '101002007', null, null, null, null, '/LoginLogAction.do?cmd=queryAll', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000030', '0', '0', 1, '系统配置管理', '101002008', null, null, null, null, '/SysParamsAction.do?cmd=queryAlll', null, null, '1', null, now(), null);


insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000032', '0', '0', 1, '授权日志管理', '101002009', null, null, '101002009', null, '/AuAUTHORIZELogAction.do?cmd=queryAll', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000033', '0', '0', 1, '代理管理', '101002010', null, null, '101002010', null, null, null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000034', '0', '0', 1, '设置代理', '101002010001', null, null, '101002010001', null, '/ProxyAction.do?cmd=showTree', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000035', '0', '0', 1, '我的代理', '101002010002', null, null, '101002010002', null, '/ProxyHistoryAction.do?cmd=queryAll&forwardPage=sponsor', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000036', '0', '0', 1, '被我代理', '101002010003', null, null, '101002010003', null, '/ProxyHistoryAction.do?cmd=queryAll&forwardPage=recipient', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000037', '0', '0', 1, '代理历史', '101002010004', null, null, '101002010004', null, '/ProxyHistoryAction.do?cmd=queryAll&forwardPage=listPage', null, null, '1', null, now(), null);
insert into AUTH_RESOURCE (ID, RESOURCE_TYPE, IS_PUBLIC, ACCESS_TYPE, NAME, VALUE, FILTER_TYPE, FIELD_CHINESENAME, FIELD_NAME, TABLE_CHINESENAME, TABLE_NAME, GROUP_TYPE, HELP, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000038', '0', '0', 1, '工作日历管理', '101002011', null, null, null, null, '/jsp/Authority/calendar/workCalendar.jsp', null, null, '1', null, now(), null);

insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000001', '0', '功能菜单', '101', null, null, '101', null, '101', 1, '101', '根节点', '0', '0', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000009', '0', '权限管理', '101002', null, null, '002', '101', '101002', 2, '101003', null, '0', '0', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000010', '0', '用户管理', '101002001', null, '/UserAction.do?cmd=queryAll', '001', '101002', '101002001', 3, '101002001', null, '1', '1', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000011', '0', '角色管理', '101002002', null, '/RoleAction.do?cmd=showTree', '002', '101002', '101002002', 3, '101002002', null, '1', '1', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000012', '0', '菜单管理', '101002003', null, '/jsp/Authority/AU/AUfunctree/listAuFunctree.jsp', '003', '101002', '101002003', 3, '101002003', null, '1', '1', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000013', '0', '授权管理', '101002004', null, null, '004', '101002', '101002004', 3, '101002004', null, '0', '0', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000014', '0', '用户授权', '101002004001', null, '/VisitorAction.do?cmd=queryAllUser', '001', '101002004', '101002004001', 4, '101002004001', null, '1', '1', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000015', '0', '角色授权', '101002004002', null, '/VisitorAction.do?cmd=queryAllRole', '002', '101002004', '101002004002', 4, '101002004002', null, '1', '1', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000016', '0', '机构授权', '101002004003', null, '/VisitorAction.do?cmd=queryAllOrg', '003', '101002004', '101002004003', 4, '101002004003', null, '1', '1', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000017', '0', '资源注册', '101002005', null, null, '005', '101002', '101002005', 3, '101002005', null, '0', '0', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000018', '0', '按钮注册', '101002005001', null, '/jsp/Authority/Au/Aufunctree/listAuFunctree.jsp', '001', '101002005', '101002005001', 4, '101002005001', null, '1', '1', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000019', '0', '字段注册', '101002005002', null, '/ResourceAction.do?cmd=queryAllfield', '002', '101002005', '101002005002', 4, '101002005002', null, '1', '1', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000020', '0', '记录注册', '101002005003', null, '/ResourceAction.do?cmd=queryAll', '003', '101002005', '101002005003', 4, '101002005003', null, '1', '1', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000021', '0', '组织管理', '101003', null, null, '003', '101', '101003', 2, '101002', null, '0', '0', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000022', '0', '组织机构管理', '101003001', null, '/RelationAction.do?cmd=showTree', '001', '101003', '101003001', 3, '101003001', null, '1', '1', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000023', '0', '公司档案管理', '101003002', null, '/CompanyAction.do?cmd=queryAll', '002', '101003', '101003002', 3, '101003002', null, '1', '1', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000024', '0', '部门档案管理', '101003003', null, '/DepartmentAction.do?cmd=queryAll', '003', '101003', '101003003', 3, '101003003', null, '1', '1', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000025', '0', '岗位信息管理', '101003004', null, '/PositionAction.do?cmd=queryAll', '004', '101003', '101003004', 3, '101003004', null, '1', '1', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000026', '0', '人员档案管理', '101003005', null, '/EmployeeAction.do?cmd=queryAll', '005', '101003', '101003005', 3, '101003005', null, '1', '1', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000027', '0', '组织参照举例', '101003006', null, '/jsp/Authority/tree/orgTreeExample.jsp', '006', '101003', '101003006', 3, '101003006', null, '1', '1', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000031', '0', '历史日志管理', '101003007', null, '/HistoryLogAction.do?cmd=simpleQuery', '007', '101003', '101003007', 3, '101003007', null, '1', '1', null, '1', null,  now(), null);

insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000028', '0', '在线用户管理', '101002006', null, '/jsp/login/onlineUserList.jsp', '006', '101002', '101002006', 3, '101002007', null, '1', '1', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000029', '0', '登录日志管理', '101002007', null, '/LoginLogAction.do?cmd=queryAll', '007', '101002', '101002007', 3, '101002008', null, '1', '1', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000030', '0', '系统配置管理', '101002008', null, '/SysParamsAction.do?cmd=queryAll', '008', '101002', '101002008', 3, '101002009', null, '1', '1', null, '1', null, now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000032', '0', '授权日志管理', '101002009', null, '/AuAUTHORIZELogAction.do?cmd=queryAll', '009', '101002', '101002009', 3, '101002010', null, '1', '1', null, '1', null,  now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000033', '0', '代理管理', '101002010', null, null, '010', '101002', '101002010', 3, '101002006', null, '0', '0', null, '1', null,  now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000034', '0', '设置代理', '101002010001', null, '/ProxyAction.do?cmd=showTree', '001', '101002010', '101002010001', 4, '101002006001', null, '1', '1', null, '1', null,  now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000035', '0', '我的代理', '101002010002', null, '/ProxyHistoryAction.do?cmd=queryAll&forwardPage=sponsor', '002', '101002010', '101002010002', 4, '101002006002', null, '1', '1', null, '1', null,  now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000036', '0', '被我代理', '101002010003', null, '/ProxyHistoryAction.do?cmd=queryAll&forwardPage=recipient', '003', '101002010', '101002010003', 4, '101002006003', null, '1', '1', null, '1', null,  now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000037', '0', '代理历史', '101002010004', null, '/ProxyHistoryAction.do?cmd=queryAll&forwardPage=listPage', '004', '101002010', '101002010004', 4, '101002006004', null, '1', '1', null, '1', null,  now(), null);
insert into AUTH_FUNCTREE (ID, TYPE, NAME, KEYWORD, HOT_KEY, URL, CODE, PARENT_CODE, TOTAL_CODE, TREE_LEVEL, ORDER_CODE, HELP, IS_LEAF, TYPE_IS_LEAF, SYSTEM_ID, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020001300000000038', '0', '工作日历管理', '101002011', null, '/jsp/Authority/calendar/workCalendar.jsp', '011', '101002', '101002011', 3, '101002012', null, '1', '1', null, '1', null, now(), null);

insert into AUTH_GROUP (ID, GROUPTYPE_ID, GROUPTYPE_KEYWORD, IS_INHERIT, IS_REAL, NAME, EMAIL, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020000700000000001', '2020000500000000005', null, '0', '0', '角色根节点', null, '1', null, now(), null);
insert into AUTH_GROUP (ID, GROUPTYPE_ID, GROUPTYPE_KEYWORD, IS_INHERIT, IS_REAL, NAME, EMAIL, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020000700000000002', '2020000500000000004', null, '0', '0', '超级管理员', null, '0', null, now(), null);

insert into AUTH_GROUPRELATION (ID, RELATIONTYPE_ID, PARENT_CODE, PARENT_GROUPID, GROUPID, CODE, NAME, GROUPTYPE_ID, TYPE_LEVEL, ORDER_CODE, IS_LEAF, TYPE_IS_LEAF, IS_INHERIT, IS_CHIEF, CREATE_DATE, MODIFY_DATE)
values ('2020000800000000001','2020000400000000002','2020000400000000002','2020000400000000002','2020000700000000001','202000040000000000200001','角色根节点','2020000500000000005',1,'202000040000000000200001','1','1','1','1', now(), null);

insert into AUTH_USER (ID, GROUP_ID, LOGIN_ID, PASSWORD, NAME, IS_ADMIN, AGENT_STATUS, LOGIN_IP, ENABLE_STATUS, ENABLE_DATE, LOGIN_DATE, CREATE_DATE, MODIFY_DATE, RETIRE_DATE, SYSTEM_CODE)
values ('2020001000000000001', '2020000700000000002', 'admin', '123456', '超级管理员', '1', '0', null, '1', null, null, now(), null, null, null);

insert into AUTH_SYSPARAS (ID, PROPERTYKEY, VALUE, INITTIME, UPDATETIME, CREATORID, CREATORNAME, DESCRIPTION, CLOUMN1, ENABLE)
values ('2020001800000000001', 'RETRYTIMES', '3', now(), now(), '2020000700000000002', 'admin', '密码重试次数。', null, '0');
insert into AUTH_SYSPARAS (ID, PROPERTYKEY, VALUE, INITTIME, UPDATETIME, CREATORID, CREATORNAME, DESCRIPTION, CLOUMN1, ENABLE)
values ('2020001800000000002', 'PWDLIFECYCLE', '5', now(), now(), '2020000700000000002', 'admin', '密码有效天数。', null, '0');
insert into AUTH_SYSPARAS (ID, PROPERTYKEY, VALUE, INITTIME, UPDATETIME, CREATORID, CREATORNAME, DESCRIPTION, CLOUMN1, ENABLE)
values ('2020001800000000003', 'PWDNOFITY', '2', now(), now(), '2020000700000000002', 'admin', '密码过期前提示天数。', null, '0');
insert into AUTH_SYSPARAS (ID, PROPERTYKEY, VALUE, INITTIME, UPDATETIME, CREATORID, CREATORNAME, DESCRIPTION, CLOUMN1, ENABLE)
values ('2020001800000000004', 'CHOOSESAREL', 'true', now(), now(), '2020000700000000002', 'admin', '是否启用登陆关系选择功能，true为是，false为否。', null, '0');
insert into AUTH_SYSPARAS (ID, PROPERTYKEY, VALUE, INITTIME, UPDATETIME, CREATORID, CREATORNAME, DESCRIPTION, CLOUMN1, ENABLE)
values ('2020001800000000005', 'LOGINSTRATEGY', '1', now(), now(), '2020000700000000002', 'admin', '登陆互斥：1为启用。', null, '0');
insert into AUTH_SYSPARAS (ID, PROPERTYKEY, VALUE, INITTIME, UPDATETIME, CREATORID, CREATORNAME, DESCRIPTION, CLOUMN1, ENABLE)
values ('2020001800000000006', 'CHECKCODE', 'false', now(), now(), '2020000700000000002', 'admin', '是否启用校验码：ture表示是，其它表示否。', null, '0');
insert into AUTH_SYSPARAS (ID, PROPERTYKEY, VALUE, INITTIME, UPDATETIME, CREATORID, CREATORNAME, DESCRIPTION, CLOUMN1, ENABLE)
values ('2020001800000000008', 'CHANGEPASSWORD', '1', now(), now(), '2020000700000000002', 'admin', '强制首次登陆时更新密码，0表示不强制更新，1表示建议更新，2表示强制更新。', null, '0');
insert into AUTH_SYSPARAS (ID, PROPERTYKEY, VALUE, INITTIME, UPDATETIME, CREATORID, CREATORNAME, DESCRIPTION, CLOUMN1, ENABLE)
values ('2020001800000000011', 'ADMIN_PWD_EXPIRED', 'true', now(), now(), '2020000700000000002', 'admin', '管理员密码是否过期：true为过期。', null, '0');
insert into AUTH_SYSPARAS (ID, PROPERTYKEY, VALUE, INITTIME, UPDATETIME, CREATORID, CREATORNAME, DESCRIPTION, CLOUMN1, ENABLE)
values ('2020001800000000012', 'SESSIONTIMEOUT', '36000', now(), now(), '2020000700000000002', 'admin', '系统session超时时间，单位为秒，默认时间为36000秒。', null, '0');
insert into AUTH_SYSPARAS (ID, PROPERTYKEY, VALUE, INITTIME, UPDATETIME, CREATORID, CREATORNAME, DESCRIPTION, CLOUMN1, ENABLE)
values ('2020001800000000013', 'ORGRELATION', 'all', now(), now(), '2020000700000000002', 'admin', '配置组织机构显示的关系类型，默认显示行政关系。输入要显示的团体关系类型ID，多个值以英文逗号分开。参数值为all时，表示显示全部关系类型。', null, '0');

insert into AUTH_SYSPARAS (ID, PROPERTYKEY, VALUE, INITTIME, UPDATETIME, CREATORID, CREATORNAME, DESCRIPTION, CLOUMN1, ENABLE)
values ('2020001800000000010', 'ORGANIZETOOLTIP', '1', now(), now(), '2020000700000000002', 'admin', '是否使用提示框的形式显示组织机构树，0表示禁用，1表示启用。默认为禁用。', null, '0');

insert into AUTH_SYSPARAS (ID, PROPERTYKEY, VALUE, INITTIME, UPDATETIME, CREATORID, CREATORNAME, DESCRIPTION, CLOUMN1, ENABLE)
values ('2020001800000000014', 'MULTITAB', '5', now(), now(), '2020000700000000002', 'admin', '多页签功能，0为不使用多页签，输入其它数值为开启页签的最大数，默认为5个。', null, '1');
insert into AUTH_SYSPARAS (ID, PROPERTYKEY, VALUE, INITTIME, UPDATETIME, CREATORID, CREATORNAME, DESCRIPTION, CLOUMN1, ENABLE)
values ('2020001800000000015', 'WORKCALENDARSTYLE', 'left', now(), now(), '2020000700000000002', 'admin', '工作日历布局样式配置：top、hidden和left可供选择。', null, '0');
insert into AUTH_SYSPARAS (ID, PROPERTYKEY, VALUE, INITTIME, UPDATETIME, CREATORID, CREATORNAME, DESCRIPTION, CLOUMN1, ENABLE)
values ('2020001800000000016', 'FUNCMENUTYPE', '1', now(), now(), '2020000700000000002', 'admin', '功能菜单展现方式，0：树形菜单，1：三级菜单，默认为树形菜单。', null, '0');

-- proxy
insert into AUTH_GROUPRELATIONTYPE (ID, NAME, KEYWORD, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000400000000003', '代理关系', '0', '1', null, now(), null, null);

insert into AUTH_GROUPTYPE (ID, NAME, KEYWORD, TABLE_NAME, CODE_PREFIX, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000500000000006', '代理', '0', null, null, '1', null, now(), null, null);

insert into AUTH_CONNECTRULE (ID, RELATION_TYPE_ID, PARENT_GROUPTYPE_ID, CHILD_GROUPTYPE_ID, NAME, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000600000000009', '2020000400000000003', '2020000500000000006', '2020000500000000004', '代理关系规则1', now(), null, '代理连接员工');

insert into AUTH_CONNECTRULE (ID, RELATION_TYPE_ID, PARENT_GROUPTYPE_ID, CHILD_GROUPTYPE_ID, NAME, CREATE_DATE, MODIFY_DATE, REMARK)
values ('2020000600000000010', '2020000400000000003', '2020000500000000006', '2020000500000000006', '代理关系规则2', now(), null, '代理连接代理');

insert into AUTH_GROUP (ID, GROUPTYPE_ID, GROUPTYPE_KEYWORD, IS_INHERIT, IS_REAL, NAME, EMAIL, ENABLE_STATUS, ENABLE_DATE, CREATE_DATE, MODIFY_DATE)
values ('2020000700000000003', '2020000500000000006', null, '0', '0', '代理关系', null, '1', null, now(), null);

insert into AUTH_GROUPRELATION (ID, RELATIONTYPE_ID, PARENT_CODE, PARENT_GROUPID, GROUPID, CODE, NAME, GROUPTYPE_ID, TYPE_LEVEL, ORDER_CODE, IS_LEAF, TYPE_IS_LEAF, IS_INHERIT, IS_CHIEF, CREATE_DATE, MODIFY_DATE)
values ('2020000800000000002','2020000400000000003','2020000400000000003','2020000400000000003','2020000700000000003','202000040000000000300001','代理关系','2020000500000000006',1,'202000040000000000300001','1','1','1','1', now(), null);

insert into AUTH_SYSPARAS (ID, PROPERTYKEY, VALUE, INITTIME, UPDATETIME, CREATORID, CREATORNAME, DESCRIPTION,  CLOUMN1, ENABLE)
values ('2020001800000000009', 'SHOWRELATIONFLAG', '4', now(), now(), '2020000700000000002', '超级管理员', '团体关系类型达到多少时显示关系类型选择菜单。', null, '0');

insert into AUTH_VIRTUALSITETYPE (ID, TYPE_NAME, REMARK, RESOURCEID)
values ('2020004200000000001', '语言虚拟站点', '国际化语言虚拟站点', '');