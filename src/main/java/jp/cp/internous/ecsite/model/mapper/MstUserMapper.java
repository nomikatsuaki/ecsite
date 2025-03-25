package jp.cp.internous.ecsite.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.cp.internous.ecsite.model.domain.MstUser;
import jp.cp.internous.ecsite.model.form.LoginForm;

@Mapper
public interface MstUserMapper {
	
	@Select(value="SELECT * FROM mst_user WHERE user_name = #{userName} AND password = #{password}")
	MstUser findBYUserNameAndPassword(LoginForm form);

}
