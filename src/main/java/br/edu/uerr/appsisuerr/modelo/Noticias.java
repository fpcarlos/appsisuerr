/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.appsisuerr.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fpcarlos
 */
@Entity
@Table(name = "tb_noticias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Noticias.findAll", query = "SELECT n FROM Noticias n")
    , @NamedQuery(name = "Noticias.findById", query = "SELECT n FROM Noticias n WHERE n.id = :id")
    , @NamedQuery(name = "Noticias.findByIdCertame", query = "SELECT n FROM Noticias n WHERE n.idCertame = :idCertame")
    , @NamedQuery(name = "Noticias.findByTipoCertame", query = "SELECT n FROM Noticias n WHERE n.tipoCertame = :tipoCertame")
    , @NamedQuery(name = "Noticias.findByTitle", query = "SELECT n FROM Noticias n WHERE n.title = :title")
    , @NamedQuery(name = "Noticias.findByAlias", query = "SELECT n FROM Noticias n WHERE n.alias = :alias")
    , @NamedQuery(name = "Noticias.findByTitleAlias", query = "SELECT n FROM Noticias n WHERE n.titleAlias = :titleAlias")
    , @NamedQuery(name = "Noticias.findByState", query = "SELECT n FROM Noticias n WHERE n.state = :state")
    , @NamedQuery(name = "Noticias.findBySectionid", query = "SELECT n FROM Noticias n WHERE n.sectionid = :sectionid")
    , @NamedQuery(name = "Noticias.findByMask", query = "SELECT n FROM Noticias n WHERE n.mask = :mask")
    , @NamedQuery(name = "Noticias.findByCatid", query = "SELECT n FROM Noticias n WHERE n.catid = :catid")
    , @NamedQuery(name = "Noticias.findByCreated", query = "SELECT n FROM Noticias n WHERE n.created = :created")
    , @NamedQuery(name = "Noticias.findByCreatedBy", query = "SELECT n FROM Noticias n WHERE n.createdBy = :createdBy")
    , @NamedQuery(name = "Noticias.findByCreatedByAlias", query = "SELECT n FROM Noticias n WHERE n.createdByAlias = :createdByAlias")
    , @NamedQuery(name = "Noticias.findByModified", query = "SELECT n FROM Noticias n WHERE n.modified = :modified")
    , @NamedQuery(name = "Noticias.findByModifiedBy", query = "SELECT n FROM Noticias n WHERE n.modifiedBy = :modifiedBy")
    , @NamedQuery(name = "Noticias.findByCheckedOut", query = "SELECT n FROM Noticias n WHERE n.checkedOut = :checkedOut")
    , @NamedQuery(name = "Noticias.findByCheckedOutTime", query = "SELECT n FROM Noticias n WHERE n.checkedOutTime = :checkedOutTime")
    , @NamedQuery(name = "Noticias.findByPublishUp", query = "SELECT n FROM Noticias n WHERE n.publishUp = :publishUp")
    , @NamedQuery(name = "Noticias.findByPublishDown", query = "SELECT n FROM Noticias n WHERE n.publishDown = :publishDown")
    , @NamedQuery(name = "Noticias.findByVersion", query = "SELECT n FROM Noticias n WHERE n.version = :version")
    , @NamedQuery(name = "Noticias.findByParentid", query = "SELECT n FROM Noticias n WHERE n.parentid = :parentid")
    , @NamedQuery(name = "Noticias.findByOrdering", query = "SELECT n FROM Noticias n WHERE n.ordering = :ordering")
    , @NamedQuery(name = "Noticias.findByAccess", query = "SELECT n FROM Noticias n WHERE n.access = :access")
    , @NamedQuery(name = "Noticias.findByHits", query = "SELECT n FROM Noticias n WHERE n.hits = :hits")})
public class Noticias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_certame")
    private int idCertame;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_certame")
    private int tipoCertame;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "alias")
    private String alias;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "title_alias")
    private String titleAlias;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "introtext")
    private String introtext;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "texto")
    private String texto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "state")
    private short state;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sectionid")
    private int sectionid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mask")
    private int mask;
    @Basic(optional = false)
    @NotNull
    @Column(name = "catid")
    private int catid;
    @Column(name = "created")
    @Temporal(TemporalType.DATE)
    private Date created;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_by")
    private int createdBy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "created_by_alias")
    private String createdByAlias;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modified_by")
    private int modifiedBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out")
    private int checkedOut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkedOutTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "publish_up")
    @Temporal(TemporalType.TIMESTAMP)
    private Date publishUp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "publish_down")
    @Temporal(TemporalType.TIMESTAMP)
    private Date publishDown;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "images")
    private String images;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "urls")
    private String urls;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "attribs")
    private String attribs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parentid")
    private int parentid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering")
    private int ordering;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "metakey")
    private String metakey;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "metadesc")
    private String metadesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "access")
    private int access;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hits")
    private int hits;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "metadata")
    private String metadata;

    public Noticias() {
    }

    public Noticias(Integer id) {
        this.id = id;
    }

    public Noticias(Integer id, int idCertame, int tipoCertame, String title, String alias, String titleAlias, String introtext, String texto, short state, int sectionid, int mask, int catid, int createdBy, String createdByAlias, Date modified, int modifiedBy, int checkedOut, Date checkedOutTime, Date publishUp, Date publishDown, String images, String urls, String attribs, int version, int parentid, int ordering, String metakey, String metadesc, int access, int hits, String metadata) {
        this.id = id;
        this.idCertame = idCertame;
        this.tipoCertame = tipoCertame;
        this.title = title;
        this.alias = alias;
        this.titleAlias = titleAlias;
        this.introtext = introtext;
        this.texto = texto;
        this.state = state;
        this.sectionid = sectionid;
        this.mask = mask;
        this.catid = catid;
        this.createdBy = createdBy;
        this.createdByAlias = createdByAlias;
        this.modified = modified;
        this.modifiedBy = modifiedBy;
        this.checkedOut = checkedOut;
        this.checkedOutTime = checkedOutTime;
        this.publishUp = publishUp;
        this.publishDown = publishDown;
        this.images = images;
        this.urls = urls;
        this.attribs = attribs;
        this.version = version;
        this.parentid = parentid;
        this.ordering = ordering;
        this.metakey = metakey;
        this.metadesc = metadesc;
        this.access = access;
        this.hits = hits;
        this.metadata = metadata;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdCertame() {
        return idCertame;
    }

    public void setIdCertame(int idCertame) {
        this.idCertame = idCertame;
    }

    public int getTipoCertame() {
        return tipoCertame;
    }

    public void setTipoCertame(int tipoCertame) {
        this.tipoCertame = tipoCertame;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTitleAlias() {
        return titleAlias;
    }

    public void setTitleAlias(String titleAlias) {
        this.titleAlias = titleAlias;
    }

    public String getIntrotext() {
        return introtext;
    }

    public void setIntrotext(String introtext) {
        this.introtext = introtext;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public int getSectionid() {
        return sectionid;
    }

    public void setSectionid(int sectionid) {
        this.sectionid = sectionid;
    }

    public int getMask() {
        return mask;
    }

    public void setMask(int mask) {
        this.mask = mask;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedByAlias() {
        return createdByAlias;
    }

    public void setCreatedByAlias(String createdByAlias) {
        this.createdByAlias = createdByAlias;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public int getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(int modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public int getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(int checkedOut) {
        this.checkedOut = checkedOut;
    }

    public Date getCheckedOutTime() {
        return checkedOutTime;
    }

    public void setCheckedOutTime(Date checkedOutTime) {
        this.checkedOutTime = checkedOutTime;
    }

    public Date getPublishUp() {
        return publishUp;
    }

    public void setPublishUp(Date publishUp) {
        this.publishUp = publishUp;
    }

    public Date getPublishDown() {
        return publishDown;
    }

    public void setPublishDown(Date publishDown) {
        this.publishDown = publishDown;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public String getAttribs() {
        return attribs;
    }

    public void setAttribs(String attribs) {
        this.attribs = attribs;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public String getMetakey() {
        return metakey;
    }

    public void setMetakey(String metakey) {
        this.metakey = metakey;
    }

    public String getMetadesc() {
        return metadesc;
    }

    public void setMetadesc(String metadesc) {
        this.metadesc = metadesc;
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Noticias)) {
            return false;
        }
        Noticias other = (Noticias) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.appsisuerr.modelo.Noticias[ id=" + id + " ]";
    }
    
}
