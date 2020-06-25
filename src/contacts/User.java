/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author abc
 */
@Entity
@Table(name = "user", catalog = "mysql", schema = "")
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
    , @NamedQuery(name = "User.findByHost", query = "SELECT u FROM User u WHERE u.userPK.host = :host")
    , @NamedQuery(name = "User.findByUser", query = "SELECT u FROM User u WHERE u.userPK.user = :user")
    , @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password")
    , @NamedQuery(name = "User.findBySelectpriv", query = "SELECT u FROM User u WHERE u.selectpriv = :selectpriv")
    , @NamedQuery(name = "User.findByInsertpriv", query = "SELECT u FROM User u WHERE u.insertpriv = :insertpriv")
    , @NamedQuery(name = "User.findByUpdatepriv", query = "SELECT u FROM User u WHERE u.updatepriv = :updatepriv")
    , @NamedQuery(name = "User.findByDeletepriv", query = "SELECT u FROM User u WHERE u.deletepriv = :deletepriv")
    , @NamedQuery(name = "User.findByCreatepriv", query = "SELECT u FROM User u WHERE u.createpriv = :createpriv")
    , @NamedQuery(name = "User.findByDroppriv", query = "SELECT u FROM User u WHERE u.droppriv = :droppriv")
    , @NamedQuery(name = "User.findByReloadpriv", query = "SELECT u FROM User u WHERE u.reloadpriv = :reloadpriv")
    , @NamedQuery(name = "User.findByShutdownpriv", query = "SELECT u FROM User u WHERE u.shutdownpriv = :shutdownpriv")
    , @NamedQuery(name = "User.findByProcesspriv", query = "SELECT u FROM User u WHERE u.processpriv = :processpriv")
    , @NamedQuery(name = "User.findByFilepriv", query = "SELECT u FROM User u WHERE u.filepriv = :filepriv")
    , @NamedQuery(name = "User.findByGrantpriv", query = "SELECT u FROM User u WHERE u.grantpriv = :grantpriv")
    , @NamedQuery(name = "User.findByReferencespriv", query = "SELECT u FROM User u WHERE u.referencespriv = :referencespriv")
    , @NamedQuery(name = "User.findByIndexpriv", query = "SELECT u FROM User u WHERE u.indexpriv = :indexpriv")
    , @NamedQuery(name = "User.findByAlterpriv", query = "SELECT u FROM User u WHERE u.alterpriv = :alterpriv")
    , @NamedQuery(name = "User.findByShowdbpriv", query = "SELECT u FROM User u WHERE u.showdbpriv = :showdbpriv")
    , @NamedQuery(name = "User.findBySuperpriv", query = "SELECT u FROM User u WHERE u.superpriv = :superpriv")
    , @NamedQuery(name = "User.findByCreatetmptablepriv", query = "SELECT u FROM User u WHERE u.createtmptablepriv = :createtmptablepriv")
    , @NamedQuery(name = "User.findByLocktablespriv", query = "SELECT u FROM User u WHERE u.locktablespriv = :locktablespriv")
    , @NamedQuery(name = "User.findByExecutepriv", query = "SELECT u FROM User u WHERE u.executepriv = :executepriv")
    , @NamedQuery(name = "User.findByReplslavepriv", query = "SELECT u FROM User u WHERE u.replslavepriv = :replslavepriv")
    , @NamedQuery(name = "User.findByReplclientpriv", query = "SELECT u FROM User u WHERE u.replclientpriv = :replclientpriv")
    , @NamedQuery(name = "User.findByCreateviewpriv", query = "SELECT u FROM User u WHERE u.createviewpriv = :createviewpriv")
    , @NamedQuery(name = "User.findByShowviewpriv", query = "SELECT u FROM User u WHERE u.showviewpriv = :showviewpriv")
    , @NamedQuery(name = "User.findByCreateroutinepriv", query = "SELECT u FROM User u WHERE u.createroutinepriv = :createroutinepriv")
    , @NamedQuery(name = "User.findByAlterroutinepriv", query = "SELECT u FROM User u WHERE u.alterroutinepriv = :alterroutinepriv")
    , @NamedQuery(name = "User.findByCreateuserpriv", query = "SELECT u FROM User u WHERE u.createuserpriv = :createuserpriv")
    , @NamedQuery(name = "User.findByEventpriv", query = "SELECT u FROM User u WHERE u.eventpriv = :eventpriv")
    , @NamedQuery(name = "User.findByTriggerpriv", query = "SELECT u FROM User u WHERE u.triggerpriv = :triggerpriv")
    , @NamedQuery(name = "User.findByCreatetablespacepriv", query = "SELECT u FROM User u WHERE u.createtablespacepriv = :createtablespacepriv")
    , @NamedQuery(name = "User.findBySslType", query = "SELECT u FROM User u WHERE u.sslType = :sslType")
    , @NamedQuery(name = "User.findByMaxQuestions", query = "SELECT u FROM User u WHERE u.maxQuestions = :maxQuestions")
    , @NamedQuery(name = "User.findByMaxUpdates", query = "SELECT u FROM User u WHERE u.maxUpdates = :maxUpdates")
    , @NamedQuery(name = "User.findByMaxConnections", query = "SELECT u FROM User u WHERE u.maxConnections = :maxConnections")
    , @NamedQuery(name = "User.findByMaxUserConnections", query = "SELECT u FROM User u WHERE u.maxUserConnections = :maxUserConnections")
    , @NamedQuery(name = "User.findByPlugin", query = "SELECT u FROM User u WHERE u.plugin = :plugin")})
public class User implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UserPK userPK;
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @Column(name = "Select_priv")
    private String selectpriv;
    @Basic(optional = false)
    @Column(name = "Insert_priv")
    private String insertpriv;
    @Basic(optional = false)
    @Column(name = "Update_priv")
    private String updatepriv;
    @Basic(optional = false)
    @Column(name = "Delete_priv")
    private String deletepriv;
    @Basic(optional = false)
    @Column(name = "Create_priv")
    private String createpriv;
    @Basic(optional = false)
    @Column(name = "Drop_priv")
    private String droppriv;
    @Basic(optional = false)
    @Column(name = "Reload_priv")
    private String reloadpriv;
    @Basic(optional = false)
    @Column(name = "Shutdown_priv")
    private String shutdownpriv;
    @Basic(optional = false)
    @Column(name = "Process_priv")
    private String processpriv;
    @Basic(optional = false)
    @Column(name = "File_priv")
    private String filepriv;
    @Basic(optional = false)
    @Column(name = "Grant_priv")
    private String grantpriv;
    @Basic(optional = false)
    @Column(name = "References_priv")
    private String referencespriv;
    @Basic(optional = false)
    @Column(name = "Index_priv")
    private String indexpriv;
    @Basic(optional = false)
    @Column(name = "Alter_priv")
    private String alterpriv;
    @Basic(optional = false)
    @Column(name = "Show_db_priv")
    private String showdbpriv;
    @Basic(optional = false)
    @Column(name = "Super_priv")
    private String superpriv;
    @Basic(optional = false)
    @Column(name = "Create_tmp_table_priv")
    private String createtmptablepriv;
    @Basic(optional = false)
    @Column(name = "Lock_tables_priv")
    private String locktablespriv;
    @Basic(optional = false)
    @Column(name = "Execute_priv")
    private String executepriv;
    @Basic(optional = false)
    @Column(name = "Repl_slave_priv")
    private String replslavepriv;
    @Basic(optional = false)
    @Column(name = "Repl_client_priv")
    private String replclientpriv;
    @Basic(optional = false)
    @Column(name = "Create_view_priv")
    private String createviewpriv;
    @Basic(optional = false)
    @Column(name = "Show_view_priv")
    private String showviewpriv;
    @Basic(optional = false)
    @Column(name = "Create_routine_priv")
    private String createroutinepriv;
    @Basic(optional = false)
    @Column(name = "Alter_routine_priv")
    private String alterroutinepriv;
    @Basic(optional = false)
    @Column(name = "Create_user_priv")
    private String createuserpriv;
    @Basic(optional = false)
    @Column(name = "Event_priv")
    private String eventpriv;
    @Basic(optional = false)
    @Column(name = "Trigger_priv")
    private String triggerpriv;
    @Basic(optional = false)
    @Column(name = "Create_tablespace_priv")
    private String createtablespacepriv;
    @Basic(optional = false)
    @Column(name = "ssl_type")
    private String sslType;
    @Basic(optional = false)
    @Lob
    @Column(name = "ssl_cipher")
    private byte[] sslCipher;
    @Basic(optional = false)
    @Lob
    @Column(name = "x509_issuer")
    private byte[] x509Issuer;
    @Basic(optional = false)
    @Lob
    @Column(name = "x509_subject")
    private byte[] x509Subject;
    @Basic(optional = false)
    @Column(name = "max_questions")
    private int maxQuestions;
    @Basic(optional = false)
    @Column(name = "max_updates")
    private int maxUpdates;
    @Basic(optional = false)
    @Column(name = "max_connections")
    private int maxConnections;
    @Basic(optional = false)
    @Column(name = "max_user_connections")
    private int maxUserConnections;
    @Column(name = "plugin")
    private String plugin;
    @Lob
    @Column(name = "authentication_string")
    private String authenticationString;

    public User() {
    }

    public User(UserPK userPK) {
        this.userPK = userPK;
    }

    public User(UserPK userPK, String password, String selectpriv, String insertpriv, String updatepriv, String deletepriv, String createpriv, String droppriv, String reloadpriv, String shutdownpriv, String processpriv, String filepriv, String grantpriv, String referencespriv, String indexpriv, String alterpriv, String showdbpriv, String superpriv, String createtmptablepriv, String locktablespriv, String executepriv, String replslavepriv, String replclientpriv, String createviewpriv, String showviewpriv, String createroutinepriv, String alterroutinepriv, String createuserpriv, String eventpriv, String triggerpriv, String createtablespacepriv, String sslType, byte[] sslCipher, byte[] x509Issuer, byte[] x509Subject, int maxQuestions, int maxUpdates, int maxConnections, int maxUserConnections) {
        this.userPK = userPK;
        this.password = password;
        this.selectpriv = selectpriv;
        this.insertpriv = insertpriv;
        this.updatepriv = updatepriv;
        this.deletepriv = deletepriv;
        this.createpriv = createpriv;
        this.droppriv = droppriv;
        this.reloadpriv = reloadpriv;
        this.shutdownpriv = shutdownpriv;
        this.processpriv = processpriv;
        this.filepriv = filepriv;
        this.grantpriv = grantpriv;
        this.referencespriv = referencespriv;
        this.indexpriv = indexpriv;
        this.alterpriv = alterpriv;
        this.showdbpriv = showdbpriv;
        this.superpriv = superpriv;
        this.createtmptablepriv = createtmptablepriv;
        this.locktablespriv = locktablespriv;
        this.executepriv = executepriv;
        this.replslavepriv = replslavepriv;
        this.replclientpriv = replclientpriv;
        this.createviewpriv = createviewpriv;
        this.showviewpriv = showviewpriv;
        this.createroutinepriv = createroutinepriv;
        this.alterroutinepriv = alterroutinepriv;
        this.createuserpriv = createuserpriv;
        this.eventpriv = eventpriv;
        this.triggerpriv = triggerpriv;
        this.createtablespacepriv = createtablespacepriv;
        this.sslType = sslType;
        this.sslCipher = sslCipher;
        this.x509Issuer = x509Issuer;
        this.x509Subject = x509Subject;
        this.maxQuestions = maxQuestions;
        this.maxUpdates = maxUpdates;
        this.maxConnections = maxConnections;
        this.maxUserConnections = maxUserConnections;
    }

    public User(String host, String user) {
        this.userPK = new UserPK(host, user);
    }

    public UserPK getUserPK() {
        return userPK;
    }

    public void setUserPK(UserPK userPK) {
        this.userPK = userPK;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getSelectpriv() {
        return selectpriv;
    }

    public void setSelectpriv(String selectpriv) {
        String oldSelectpriv = this.selectpriv;
        this.selectpriv = selectpriv;
        changeSupport.firePropertyChange("selectpriv", oldSelectpriv, selectpriv);
    }

    public String getInsertpriv() {
        return insertpriv;
    }

    public void setInsertpriv(String insertpriv) {
        String oldInsertpriv = this.insertpriv;
        this.insertpriv = insertpriv;
        changeSupport.firePropertyChange("insertpriv", oldInsertpriv, insertpriv);
    }

    public String getUpdatepriv() {
        return updatepriv;
    }

    public void setUpdatepriv(String updatepriv) {
        String oldUpdatepriv = this.updatepriv;
        this.updatepriv = updatepriv;
        changeSupport.firePropertyChange("updatepriv", oldUpdatepriv, updatepriv);
    }

    public String getDeletepriv() {
        return deletepriv;
    }

    public void setDeletepriv(String deletepriv) {
        String oldDeletepriv = this.deletepriv;
        this.deletepriv = deletepriv;
        changeSupport.firePropertyChange("deletepriv", oldDeletepriv, deletepriv);
    }

    public String getCreatepriv() {
        return createpriv;
    }

    public void setCreatepriv(String createpriv) {
        String oldCreatepriv = this.createpriv;
        this.createpriv = createpriv;
        changeSupport.firePropertyChange("createpriv", oldCreatepriv, createpriv);
    }

    public String getDroppriv() {
        return droppriv;
    }

    public void setDroppriv(String droppriv) {
        String oldDroppriv = this.droppriv;
        this.droppriv = droppriv;
        changeSupport.firePropertyChange("droppriv", oldDroppriv, droppriv);
    }

    public String getReloadpriv() {
        return reloadpriv;
    }

    public void setReloadpriv(String reloadpriv) {
        String oldReloadpriv = this.reloadpriv;
        this.reloadpriv = reloadpriv;
        changeSupport.firePropertyChange("reloadpriv", oldReloadpriv, reloadpriv);
    }

    public String getShutdownpriv() {
        return shutdownpriv;
    }

    public void setShutdownpriv(String shutdownpriv) {
        String oldShutdownpriv = this.shutdownpriv;
        this.shutdownpriv = shutdownpriv;
        changeSupport.firePropertyChange("shutdownpriv", oldShutdownpriv, shutdownpriv);
    }

    public String getProcesspriv() {
        return processpriv;
    }

    public void setProcesspriv(String processpriv) {
        String oldProcesspriv = this.processpriv;
        this.processpriv = processpriv;
        changeSupport.firePropertyChange("processpriv", oldProcesspriv, processpriv);
    }

    public String getFilepriv() {
        return filepriv;
    }

    public void setFilepriv(String filepriv) {
        String oldFilepriv = this.filepriv;
        this.filepriv = filepriv;
        changeSupport.firePropertyChange("filepriv", oldFilepriv, filepriv);
    }

    public String getGrantpriv() {
        return grantpriv;
    }

    public void setGrantpriv(String grantpriv) {
        String oldGrantpriv = this.grantpriv;
        this.grantpriv = grantpriv;
        changeSupport.firePropertyChange("grantpriv", oldGrantpriv, grantpriv);
    }

    public String getReferencespriv() {
        return referencespriv;
    }

    public void setReferencespriv(String referencespriv) {
        String oldReferencespriv = this.referencespriv;
        this.referencespriv = referencespriv;
        changeSupport.firePropertyChange("referencespriv", oldReferencespriv, referencespriv);
    }

    public String getIndexpriv() {
        return indexpriv;
    }

    public void setIndexpriv(String indexpriv) {
        String oldIndexpriv = this.indexpriv;
        this.indexpriv = indexpriv;
        changeSupport.firePropertyChange("indexpriv", oldIndexpriv, indexpriv);
    }

    public String getAlterpriv() {
        return alterpriv;
    }

    public void setAlterpriv(String alterpriv) {
        String oldAlterpriv = this.alterpriv;
        this.alterpriv = alterpriv;
        changeSupport.firePropertyChange("alterpriv", oldAlterpriv, alterpriv);
    }

    public String getShowdbpriv() {
        return showdbpriv;
    }

    public void setShowdbpriv(String showdbpriv) {
        String oldShowdbpriv = this.showdbpriv;
        this.showdbpriv = showdbpriv;
        changeSupport.firePropertyChange("showdbpriv", oldShowdbpriv, showdbpriv);
    }

    public String getSuperpriv() {
        return superpriv;
    }

    public void setSuperpriv(String superpriv) {
        String oldSuperpriv = this.superpriv;
        this.superpriv = superpriv;
        changeSupport.firePropertyChange("superpriv", oldSuperpriv, superpriv);
    }

    public String getCreatetmptablepriv() {
        return createtmptablepriv;
    }

    public void setCreatetmptablepriv(String createtmptablepriv) {
        String oldCreatetmptablepriv = this.createtmptablepriv;
        this.createtmptablepriv = createtmptablepriv;
        changeSupport.firePropertyChange("createtmptablepriv", oldCreatetmptablepriv, createtmptablepriv);
    }

    public String getLocktablespriv() {
        return locktablespriv;
    }

    public void setLocktablespriv(String locktablespriv) {
        String oldLocktablespriv = this.locktablespriv;
        this.locktablespriv = locktablespriv;
        changeSupport.firePropertyChange("locktablespriv", oldLocktablespriv, locktablespriv);
    }

    public String getExecutepriv() {
        return executepriv;
    }

    public void setExecutepriv(String executepriv) {
        String oldExecutepriv = this.executepriv;
        this.executepriv = executepriv;
        changeSupport.firePropertyChange("executepriv", oldExecutepriv, executepriv);
    }

    public String getReplslavepriv() {
        return replslavepriv;
    }

    public void setReplslavepriv(String replslavepriv) {
        String oldReplslavepriv = this.replslavepriv;
        this.replslavepriv = replslavepriv;
        changeSupport.firePropertyChange("replslavepriv", oldReplslavepriv, replslavepriv);
    }

    public String getReplclientpriv() {
        return replclientpriv;
    }

    public void setReplclientpriv(String replclientpriv) {
        String oldReplclientpriv = this.replclientpriv;
        this.replclientpriv = replclientpriv;
        changeSupport.firePropertyChange("replclientpriv", oldReplclientpriv, replclientpriv);
    }

    public String getCreateviewpriv() {
        return createviewpriv;
    }

    public void setCreateviewpriv(String createviewpriv) {
        String oldCreateviewpriv = this.createviewpriv;
        this.createviewpriv = createviewpriv;
        changeSupport.firePropertyChange("createviewpriv", oldCreateviewpriv, createviewpriv);
    }

    public String getShowviewpriv() {
        return showviewpriv;
    }

    public void setShowviewpriv(String showviewpriv) {
        String oldShowviewpriv = this.showviewpriv;
        this.showviewpriv = showviewpriv;
        changeSupport.firePropertyChange("showviewpriv", oldShowviewpriv, showviewpriv);
    }

    public String getCreateroutinepriv() {
        return createroutinepriv;
    }

    public void setCreateroutinepriv(String createroutinepriv) {
        String oldCreateroutinepriv = this.createroutinepriv;
        this.createroutinepriv = createroutinepriv;
        changeSupport.firePropertyChange("createroutinepriv", oldCreateroutinepriv, createroutinepriv);
    }

    public String getAlterroutinepriv() {
        return alterroutinepriv;
    }

    public void setAlterroutinepriv(String alterroutinepriv) {
        String oldAlterroutinepriv = this.alterroutinepriv;
        this.alterroutinepriv = alterroutinepriv;
        changeSupport.firePropertyChange("alterroutinepriv", oldAlterroutinepriv, alterroutinepriv);
    }

    public String getCreateuserpriv() {
        return createuserpriv;
    }

    public void setCreateuserpriv(String createuserpriv) {
        String oldCreateuserpriv = this.createuserpriv;
        this.createuserpriv = createuserpriv;
        changeSupport.firePropertyChange("createuserpriv", oldCreateuserpriv, createuserpriv);
    }

    public String getEventpriv() {
        return eventpriv;
    }

    public void setEventpriv(String eventpriv) {
        String oldEventpriv = this.eventpriv;
        this.eventpriv = eventpriv;
        changeSupport.firePropertyChange("eventpriv", oldEventpriv, eventpriv);
    }

    public String getTriggerpriv() {
        return triggerpriv;
    }

    public void setTriggerpriv(String triggerpriv) {
        String oldTriggerpriv = this.triggerpriv;
        this.triggerpriv = triggerpriv;
        changeSupport.firePropertyChange("triggerpriv", oldTriggerpriv, triggerpriv);
    }

    public String getCreatetablespacepriv() {
        return createtablespacepriv;
    }

    public void setCreatetablespacepriv(String createtablespacepriv) {
        String oldCreatetablespacepriv = this.createtablespacepriv;
        this.createtablespacepriv = createtablespacepriv;
        changeSupport.firePropertyChange("createtablespacepriv", oldCreatetablespacepriv, createtablespacepriv);
    }

    public String getSslType() {
        return sslType;
    }

    public void setSslType(String sslType) {
        String oldSslType = this.sslType;
        this.sslType = sslType;
        changeSupport.firePropertyChange("sslType", oldSslType, sslType);
    }

    public byte[] getSslCipher() {
        return sslCipher;
    }

    public void setSslCipher(byte[] sslCipher) {
        byte[] oldSslCipher = this.sslCipher;
        this.sslCipher = sslCipher;
        changeSupport.firePropertyChange("sslCipher", oldSslCipher, sslCipher);
    }

    public byte[] getX509Issuer() {
        return x509Issuer;
    }

    public void setX509Issuer(byte[] x509Issuer) {
        byte[] oldX509Issuer = this.x509Issuer;
        this.x509Issuer = x509Issuer;
        changeSupport.firePropertyChange("X509Issuer", oldX509Issuer, x509Issuer);
    }

    public byte[] getX509Subject() {
        return x509Subject;
    }

    public void setX509Subject(byte[] x509Subject) {
        byte[] oldX509Subject = this.x509Subject;
        this.x509Subject = x509Subject;
        changeSupport.firePropertyChange("X509Subject", oldX509Subject, x509Subject);
    }

    public int getMaxQuestions() {
        return maxQuestions;
    }

    public void setMaxQuestions(int maxQuestions) {
        int oldMaxQuestions = this.maxQuestions;
        this.maxQuestions = maxQuestions;
        changeSupport.firePropertyChange("maxQuestions", oldMaxQuestions, maxQuestions);
    }

    public int getMaxUpdates() {
        return maxUpdates;
    }

    public void setMaxUpdates(int maxUpdates) {
        int oldMaxUpdates = this.maxUpdates;
        this.maxUpdates = maxUpdates;
        changeSupport.firePropertyChange("maxUpdates", oldMaxUpdates, maxUpdates);
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int maxConnections) {
        int oldMaxConnections = this.maxConnections;
        this.maxConnections = maxConnections;
        changeSupport.firePropertyChange("maxConnections", oldMaxConnections, maxConnections);
    }

    public int getMaxUserConnections() {
        return maxUserConnections;
    }

    public void setMaxUserConnections(int maxUserConnections) {
        int oldMaxUserConnections = this.maxUserConnections;
        this.maxUserConnections = maxUserConnections;
        changeSupport.firePropertyChange("maxUserConnections", oldMaxUserConnections, maxUserConnections);
    }

    public String getPlugin() {
        return plugin;
    }

    public void setPlugin(String plugin) {
        String oldPlugin = this.plugin;
        this.plugin = plugin;
        changeSupport.firePropertyChange("plugin", oldPlugin, plugin);
    }

    public String getAuthenticationString() {
        return authenticationString;
    }

    public void setAuthenticationString(String authenticationString) {
        String oldAuthenticationString = this.authenticationString;
        this.authenticationString = authenticationString;
        changeSupport.firePropertyChange("authenticationString", oldAuthenticationString, authenticationString);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userPK != null ? userPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.userPK == null && other.userPK != null) || (this.userPK != null && !this.userPK.equals(other.userPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "contacts.User[ userPK=" + userPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
