/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author fer
 */
@Entity
@Table(name = "factura")
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query = "SELECT f FROM Factura f"),
    @NamedQuery(name = "Factura.findByPk", query = "SELECT f FROM Factura f WHERE f.pk = :pk"),
    @NamedQuery(name = "Factura.findByFechaEmision", query = "SELECT f FROM Factura f WHERE f.fechaEmision = :fechaEmision"),
    @NamedQuery(name = "Factura.findByDescripcion", query = "SELECT f FROM Factura f WHERE f.descripcion = :descripcion"),
    @NamedQuery(name = "Factura.findByTotalImporteFactura", query = "SELECT f FROM Factura f WHERE f.totalImporteFactura = :totalImporteFactura")})
public class Factura implements Serializable {

    //ATRIBUTOS
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pk")
    private String pk;
    @Column(name = "fecha_emision")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "totalImporteFactura")
    private Double totalImporteFactura;

    
    //Constructores
    public Factura() {
    }

    public Factura(String pk, Date fechaEmision, String descripcion, Double totalImporteFactura) {
        this.pk = pk;
        this.fechaEmision = fechaEmision;
        this.descripcion = descripcion;
        this.totalImporteFactura = totalImporteFactura;
    }
    
    

    public Factura(String pk) {
        this.pk = pk;
    }

    //GETTERS Y SETTERS
    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getTotalImporteFactura() {
        return totalImporteFactura;
    }

    public void setTotalImporteFactura(Double totalImporteFactura) {
        this.totalImporteFactura = totalImporteFactura;
    }

    //EQUALS Y HASHCODE
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pk != null ? pk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.pk == null && other.pk != null) || (this.pk != null && !this.pk.equals(other.pk))) {
            return false;
        }
        return true;
    }

    //TO STRING
    @Override
    public String toString() {
        return "entidades.Factura[ pk=" + pk + " ]";
    }
    
}
