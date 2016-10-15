/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revolvinglamp.model;

import java.math.BigInteger;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author lxy
 */
public class GoalPOJO {

    private Long id;

    private Boolean booleanalpha;
    private Boolean booleanbeta;
    private Boolean booleandelta;
    private Boolean booleangamma;
    private String category;

    private Date createtime;

    private String creator;

    private Boolean deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getBooleanalpha() {
        return booleanalpha;
    }

    public void setBooleanalpha(Boolean booleanalpha) {
        this.booleanalpha = booleanalpha;
    }

    public Boolean getBooleanbeta() {
        return booleanbeta;
    }

    public void setBooleanbeta(Boolean booleanbeta) {
        this.booleanbeta = booleanbeta;
    }

    public Boolean getBooleandelta() {
        return booleandelta;
    }

    public void setBooleandelta(Boolean booleandelta) {
        this.booleandelta = booleandelta;
    }

    public Boolean getBooleangamma() {
        return booleangamma;
    }

    public void setBooleangamma(Boolean booleangamma) {
        this.booleangamma = booleangamma;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getLastmodifier() {
        return lastmodifier;
    }

    public void setLastmodifier(String lastmodifier) {
        this.lastmodifier = lastmodifier;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public BigInteger getModifycount() {
        return modifycount;
    }

    public void setModifycount(BigInteger modifycount) {
        this.modifycount = modifycount;
    }

    public BigInteger getNumberbeta() {
        return numberbeta;
    }

    public void setNumberbeta(BigInteger numberbeta) {
        this.numberbeta = numberbeta;
    }

    public BigInteger getNumberdelta() {
        return numberdelta;
    }

    public void setNumberdelta(BigInteger numberdelta) {
        this.numberdelta = numberdelta;
    }

    public BigInteger getNumberepsilon() {
        return numberepsilon;
    }

    public void setNumberepsilon(BigInteger numberepsilon) {
        this.numberepsilon = numberepsilon;
    }

    public BigInteger getNumbereta() {
        return numbereta;
    }

    public void setNumbereta(BigInteger numbereta) {
        this.numbereta = numbereta;
    }

    public BigInteger getNumbergamma() {
        return numbergamma;
    }

    public void setNumbergamma(BigInteger numbergamma) {
        this.numbergamma = numbergamma;
    }

    public BigInteger getNumberkappa() {
        return numberkappa;
    }

    public void setNumberkappa(BigInteger numberkappa) {
        this.numberkappa = numberkappa;
    }

    public BigInteger getNumberlambda() {
        return numberlambda;
    }

    public void setNumberlambda(BigInteger numberlambda) {
        this.numberlambda = numberlambda;
    }

    public BigInteger getNumberlota() {
        return numberlota;
    }

    public void setNumberlota(BigInteger numberlota) {
        this.numberlota = numberlota;
    }

    public BigInteger getNumberomega() {
        return numberomega;
    }

    public void setNumberomega(BigInteger numberomega) {
        this.numberomega = numberomega;
    }

    public BigInteger getNumbertheta() {
        return numbertheta;
    }

    public void setNumbertheta(BigInteger numbertheta) {
        this.numbertheta = numbertheta;
    }

    public BigInteger getNumberzeta() {
        return numberzeta;
    }

    public void setNumberzeta(BigInteger numberzeta) {
        this.numberzeta = numberzeta;
    }

    public BigInteger getParentid() {
        return parentid;
    }

    public void setParentid(BigInteger parentid) {
        this.parentid = parentid;
    }

    public BigInteger getPriority() {
        return priority;
    }

    public void setPriority(BigInteger priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStringbeta() {
        return stringbeta;
    }

    public void setStringbeta(String stringbeta) {
        this.stringbeta = stringbeta;
    }

    public String getStringdelta() {
        return stringdelta;
    }

    public void setStringdelta(String stringdelta) {
        this.stringdelta = stringdelta;
    }

    public String getStringepsilon() {
        return stringepsilon;
    }

    public void setStringepsilon(String stringepsilon) {
        this.stringepsilon = stringepsilon;
    }

    public String getStringeta() {
        return stringeta;
    }

    public void setStringeta(String stringeta) {
        this.stringeta = stringeta;
    }

    public String getStringgamma() {
        return stringgamma;
    }

    public void setStringgamma(String stringgamma) {
        this.stringgamma = stringgamma;
    }

    public String getStringkappa() {
        return stringkappa;
    }

    public void setStringkappa(String stringkappa) {
        this.stringkappa = stringkappa;
    }

    public String getStringlambda() {
        return stringlambda;
    }

    public void setStringlambda(String stringlambda) {
        this.stringlambda = stringlambda;
    }

    public String getStringlota() {
        return stringlota;
    }

    public void setStringlota(String stringlota) {
        this.stringlota = stringlota;
    }

    public String getStringomega() {
        return stringomega;
    }

    public void setStringomega(String stringomega) {
        this.stringomega = stringomega;
    }

    public String getStringtheta() {
        return stringtheta;
    }

    public void setStringtheta(String stringtheta) {
        this.stringtheta = stringtheta;
    }

    public String getStringzeta() {
        return stringzeta;
    }

    public void setStringzeta(String stringzeta) {
        this.stringzeta = stringzeta;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Set<GoalPOJO> getChildren() {
        return children;
    }

    public void setChildren(Set<GoalPOJO> children) {
        this.children = children;
    }

    private String description;

    private Boolean enabled;

    private String lastmodifier;

    private Date lastupdatetime;

    private BigInteger modifycount;

    private String name;

    private BigInteger numberalpha;

    private BigInteger numberbeta;

    private BigInteger numberdelta;
    private BigInteger numberepsilon;
    private BigInteger numbereta;
    private BigInteger numbergamma;
    private BigInteger numberkappa;
    private BigInteger numberlambda;
    private BigInteger numberlota;
    private BigInteger numberomega;
    private BigInteger numbertheta;
    private BigInteger numberzeta;
    private BigInteger parentid;
    private BigInteger priority;
    private String status;
    private String stringalpha;
    private String stringbeta;
    private String stringdelta;
    private String stringepsilon;
    private String stringeta;
    private String stringgamma;
    private String stringkappa;
    private String stringlambda;
    private String stringlota;
    private String stringomega;
    private String stringtheta;
    private String stringzeta;
    private String type;
    private Boolean valid;
    protected Set<GoalPOJO> children = new HashSet();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStringalpha() {
        return stringalpha;
    }

    public void setStringalpha(String stringalpha) {
        this.stringalpha = stringalpha;
    }

    public BigInteger getNumberalpha() {
        return numberalpha;
    }

    public void setNumberalpha(BigInteger numberalpha) {
        this.numberalpha = numberalpha;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GoalPOJO other = (GoalPOJO) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.stringalpha, other.stringalpha)) {
            return false;
        }
        if (!Objects.equals(this.numberalpha, other.numberalpha)) {
            return false;
        }
        return true;
    }

}
