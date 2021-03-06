package com.young.xshop.mapper;

import com.young.xshop.entity.NxSystemFileInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface NxSystemFileInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nx_system_file_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nx_system_file_info
     *
     * @mbg.generated
     */
    int insert(NxSystemFileInfo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nx_system_file_info
     *
     * @mbg.generated
     */
    int insertSelective(NxSystemFileInfo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nx_system_file_info
     *
     * @mbg.generated
     */
    NxSystemFileInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nx_system_file_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(NxSystemFileInfo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nx_system_file_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(NxSystemFileInfo row);
}
