package za.ac.nwu.as.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "AccountType",
        description = "A DTO that represents the AccountType"
)


public class AccountTypeDto implements Serializable {

    private String memid;
    private String memname;
    private String memsurname;


    public AccountTypeDto(String memid, String memname, String memsurname) {
        this.memid = memid;
        this.memname = memname;
        this.memsurname = memsurname;
    }

    public AccountTypeDto() {
    }
    @ApiModelProperty(position = 1,
            name =  "MemberID",
            dataType = "String",
            notes = "Member ID",
            value = "AccountType memid",
            example = "Miles",
            allowEmptyValue = true,
            required = true)
    public String getMemid() {
        return memid;
    }

    @ApiModelProperty(position = 2,
            name =  "Name",
            dataType = "String",
            notes = "Member Name",
            value = "AccountType memname",
            example = "Miles",
            allowEmptyValue = true,
            required = true)
    public String getMemname() {
        return memname;
    }

    @ApiModelProperty(position = 3,
            name =  "SurName",
            dataType = "String",
            notes = "Member Surname",
            value = "AccountType memsurname",
            example = "Miles",
            allowEmptyValue = true,
            required = true)
    public String getMemsurname() {
        return memsurname;
    }
}
