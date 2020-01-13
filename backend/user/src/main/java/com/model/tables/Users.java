/**
 * This class is generated by jOOQ
 */
package com.model.tables;


import com.model.Keys;
import com.model.SpringcloudTemplate;
import com.model.tables.records.UsersRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users extends TableImpl<UsersRecord> {

    private static final long serialVersionUID = -716852900;

    /**
     * The reference instance of <code>springcloud-template.users</code>
     */
    public static final Users USERS = new Users();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsersRecord> getRecordType() {
        return UsersRecord.class;
    }

    /**
     * The column <code>springcloud-template.users.userId</code>.
     */
    public final TableField<UsersRecord, Integer> USERID = createField("userId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>springcloud-template.users.userName</code>.
     */
    public final TableField<UsersRecord, String> USERNAME = createField("userName", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>springcloud-template.users.password</code>.
     */
    public final TableField<UsersRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>springcloud-template.users.email</code>.
     */
    public final TableField<UsersRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>springcloud-template.users.phone</code>.
     */
    public final TableField<UsersRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>springcloud-template.users.address</code>.
     */
    public final TableField<UsersRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>springcloud-template.users</code> table reference
     */
    public Users() {
        this("users", null);
    }

    /**
     * Create an aliased <code>springcloud-template.users</code> table reference
     */
    public Users(String alias) {
        this(alias, USERS);
    }

    private Users(String alias, Table<UsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Users(String alias, Table<UsersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return SpringcloudTemplate.SPRINGCLOUD_TEMPLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UsersRecord> getPrimaryKey() {
        return Keys.KEY_USERS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UsersRecord>> getKeys() {
        return Arrays.<UniqueKey<UsersRecord>>asList(Keys.KEY_USERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Users as(String alias) {
        return new Users(alias, this);
    }

    /**
     * Rename this table
     */
    public Users rename(String name) {
        return new Users(name, null);
    }
}
