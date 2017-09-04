package jp.co.rakus.ecommerce_b.repository;


import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.rakus.ecommerce_b.domain.User;

/**
 * @author yahiro
 *ユーザー情報のレポジトリ
 */
@Repository
public class UserRepository {

	NamedParameterJdbcTemplate template;
	
	
	
	public static final RowMapper<User> userRowMapper = (rs,i) -> {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setEmail(rs.getString("email"));
		user.setPassword(rs.getString("password"));
		user.setTelephone(rs.getString("telephone"));
		return user;
	};
}
