/**
* Utilitarios 
* Diversas funções utilitarias para Java
* Início: 22/09/2016
* 
*
*/


package graficosimples;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @version 
 * @author Dantcar
 * @since 
 */
@Entity
@Table(name = "ANIMAL", catalog = "", schema = "DAC")
@NamedQueries({
    @NamedQuery(name = "Animal.findAll", query = "SELECT a FROM Animal a"),
    @NamedQuery(name = "Animal.findByIdanimal", query = "SELECT a FROM Animal a WHERE a.idanimal = :idanimal"),
    @NamedQuery(name = "Animal.findByIdcliente", query = "SELECT a FROM Animal a WHERE a.idcliente = :idcliente"),
    @NamedQuery(name = "Animal.findByNome", query = "SELECT a FROM Animal a WHERE a.nome = :nome"),
    @NamedQuery(name = "Animal.findByEspecie", query = "SELECT a FROM Animal a WHERE a.especie = :especie"),
    @NamedQuery(name = "Animal.findByNascimento", query = "SELECT a FROM Animal a WHERE a.nascimento = :nascimento"),
    @NamedQuery(name = "Animal.findByRaca", query = "SELECT a FROM Animal a WHERE a.raca = :raca"),
    @NamedQuery(name = "Animal.findByPeso", query = "SELECT a FROM Animal a WHERE a.peso = :peso"),
    @NamedQuery(name = "Animal.findByAltura", query = "SELECT a FROM Animal a WHERE a.altura = :altura"),
    @NamedQuery(name = "Animal.findByCor", query = "SELECT a FROM Animal a WHERE a.cor = :cor"),
    @NamedQuery(name = "Animal.findByCaracteristica", query = "SELECT a FROM Animal a WHERE a.caracteristica = :caracteristica"),
    @NamedQuery(name = "Animal.findBySexo", query = "SELECT a FROM Animal a WHERE a.sexo = :sexo"),
    @NamedQuery(name = "Animal.findByFoto", query = "SELECT a FROM Animal a WHERE a.foto = :foto")})
public class Animal implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDANIMAL")
    private Integer idanimal;
    @Basic(optional = false)
    @Column(name = "IDCLIENTE")
    private int idcliente;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Basic(optional = false)
    @Column(name = "ESPECIE")
    private String especie;
    @Basic(optional = false)
    @Column(name = "NASCIMENTO")
    private String nascimento;
    @Column(name = "RACA")
    private String raca;
    @Column(name = "PESO")
    private String peso;
    @Column(name = "ALTURA")
    private String altura;
    @Column(name = "COR")
    private String cor;
    @Column(name = "CARACTERISTICA")
    private String caracteristica;
    @Column(name = "SEXO")
    private String sexo;
    @Column(name = "FOTO")
    private String foto;

    public Animal() {
    }

    public Animal(Integer idanimal) {
        this.idanimal = idanimal;
    }

    public Animal(Integer idanimal, int idcliente, String nome, String especie, String nascimento) {
        this.idanimal = idanimal;
        this.idcliente = idcliente;
        this.nome = nome;
        this.especie = especie;
        this.nascimento = nascimento;
    }

    public Integer getIdanimal() {
        return idanimal;
    }

    public void setIdanimal(Integer idanimal) {
        Integer oldIdanimal = this.idanimal;
        this.idanimal = idanimal;
        changeSupport.firePropertyChange("idanimal", oldIdanimal, idanimal);
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        int oldIdcliente = this.idcliente;
        this.idcliente = idcliente;
        changeSupport.firePropertyChange("idcliente", oldIdcliente, idcliente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        String oldEspecie = this.especie;
        this.especie = especie;
        changeSupport.firePropertyChange("especie", oldEspecie, especie);
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        String oldNascimento = this.nascimento;
        this.nascimento = nascimento;
        changeSupport.firePropertyChange("nascimento", oldNascimento, nascimento);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        String oldRaca = this.raca;
        this.raca = raca;
        changeSupport.firePropertyChange("raca", oldRaca, raca);
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        String oldPeso = this.peso;
        this.peso = peso;
        changeSupport.firePropertyChange("peso", oldPeso, peso);
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        String oldAltura = this.altura;
        this.altura = altura;
        changeSupport.firePropertyChange("altura", oldAltura, altura);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        String oldCor = this.cor;
        this.cor = cor;
        changeSupport.firePropertyChange("cor", oldCor, cor);
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        String oldCaracteristica = this.caracteristica;
        this.caracteristica = caracteristica;
        changeSupport.firePropertyChange("caracteristica", oldCaracteristica, caracteristica);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        String oldSexo = this.sexo;
        this.sexo = sexo;
        changeSupport.firePropertyChange("sexo", oldSexo, sexo);
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        String oldFoto = this.foto;
        this.foto = foto;
        changeSupport.firePropertyChange("foto", oldFoto, foto);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idanimal != null ? idanimal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Animal)) {
            return false;
        }
        Animal other = (Animal) object;
        if ((this.idanimal == null && other.idanimal != null) || (this.idanimal != null && !this.idanimal.equals(other.idanimal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "graficosimples.Animal[ idanimal=" + idanimal + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
