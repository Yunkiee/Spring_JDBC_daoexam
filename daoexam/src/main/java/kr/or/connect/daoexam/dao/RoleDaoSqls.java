package kr.or.connect.daoexam.dao;

public class RoleDaoSqls {
	public static final String SELECT_ALL = "select role_id, description from role order by role_id";
	public static final String UPDATE = "update role set description = :description where role_id = :roleId";
	public static final String SELECT_BY_ROLE_ID = "SELECT role_id, description FROM role where role_id = :roleId";
	public static final String DELETE_BY_ROLE_ID = "DELETE FROM role WHERE role_id = :roleId";

}
