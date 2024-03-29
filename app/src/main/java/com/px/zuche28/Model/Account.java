package com.px.zuche28.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
* Created by Mybatis Generator on 2019/07/06
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Account {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.account_id
     *
     * @mbg.generated Sat Jul 06 01:22:22 CST 2019
     */
    private Integer accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.user_name
     *
     * @mbg.generated Sat Jul 06 01:22:22 CST 2019
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.net_name
     *
     * @mbg.generated Sat Jul 06 01:22:22 CST 2019
     */
    private String netName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.password
     *
     * @mbg.generated Sat Jul 06 01:22:22 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.permission
     *
     * @mbg.generated Sat Jul 06 01:22:22 CST 2019
     */
    private String permission;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.phone
     *
     * @mbg.generated Sat Jul 06 01:22:22 CST 2019
     */
    private String phone;
}