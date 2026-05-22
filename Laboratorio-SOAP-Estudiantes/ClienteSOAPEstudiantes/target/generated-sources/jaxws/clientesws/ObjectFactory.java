
package clientesws;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientesws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Destroy_QNAME = new QName("http://ws/", "destroy");
    private static final QName _DestroyResponse_QNAME = new QName("http://ws/", "destroyResponse");
    private static final QName _Init_QNAME = new QName("http://ws/", "init");
    private static final QName _InitResponse_QNAME = new QName("http://ws/", "initResponse");
    private static final QName _InsertarEstudiante_QNAME = new QName("http://ws/", "insertarEstudiante");
    private static final QName _InsertarEstudianteResponse_QNAME = new QName("http://ws/", "insertarEstudianteResponse");
    private static final QName _ListarEstudiantes_QNAME = new QName("http://ws/", "listarEstudiantes");
    private static final QName _ListarEstudiantesResponse_QNAME = new QName("http://ws/", "listarEstudiantesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientesws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Destroy }
     * 
     * @return
     *     the new instance of {@link Destroy }
     */
    public Destroy createDestroy() {
        return new Destroy();
    }

    /**
     * Create an instance of {@link DestroyResponse }
     * 
     * @return
     *     the new instance of {@link DestroyResponse }
     */
    public DestroyResponse createDestroyResponse() {
        return new DestroyResponse();
    }

    /**
     * Create an instance of {@link Init }
     * 
     * @return
     *     the new instance of {@link Init }
     */
    public Init createInit() {
        return new Init();
    }

    /**
     * Create an instance of {@link InitResponse }
     * 
     * @return
     *     the new instance of {@link InitResponse }
     */
    public InitResponse createInitResponse() {
        return new InitResponse();
    }

    /**
     * Create an instance of {@link InsertarEstudiante }
     * 
     * @return
     *     the new instance of {@link InsertarEstudiante }
     */
    public InsertarEstudiante createInsertarEstudiante() {
        return new InsertarEstudiante();
    }

    /**
     * Create an instance of {@link InsertarEstudianteResponse }
     * 
     * @return
     *     the new instance of {@link InsertarEstudianteResponse }
     */
    public InsertarEstudianteResponse createInsertarEstudianteResponse() {
        return new InsertarEstudianteResponse();
    }

    /**
     * Create an instance of {@link ListarEstudiantes }
     * 
     * @return
     *     the new instance of {@link ListarEstudiantes }
     */
    public ListarEstudiantes createListarEstudiantes() {
        return new ListarEstudiantes();
    }

    /**
     * Create an instance of {@link ListarEstudiantesResponse }
     * 
     * @return
     *     the new instance of {@link ListarEstudiantesResponse }
     */
    public ListarEstudiantesResponse createListarEstudiantesResponse() {
        return new ListarEstudiantesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Destroy }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Destroy }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "destroy")
    public JAXBElement<Destroy> createDestroy(Destroy value) {
        return new JAXBElement<>(_Destroy_QNAME, Destroy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestroyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DestroyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "destroyResponse")
    public JAXBElement<DestroyResponse> createDestroyResponse(DestroyResponse value) {
        return new JAXBElement<>(_DestroyResponse_QNAME, DestroyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Init }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Init }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "init")
    public JAXBElement<Init> createInit(Init value) {
        return new JAXBElement<>(_Init_QNAME, Init.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InitResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "initResponse")
    public JAXBElement<InitResponse> createInitResponse(InitResponse value) {
        return new JAXBElement<>(_InitResponse_QNAME, InitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarEstudiante }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertarEstudiante }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "insertarEstudiante")
    public JAXBElement<InsertarEstudiante> createInsertarEstudiante(InsertarEstudiante value) {
        return new JAXBElement<>(_InsertarEstudiante_QNAME, InsertarEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarEstudianteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertarEstudianteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "insertarEstudianteResponse")
    public JAXBElement<InsertarEstudianteResponse> createInsertarEstudianteResponse(InsertarEstudianteResponse value) {
        return new JAXBElement<>(_InsertarEstudianteResponse_QNAME, InsertarEstudianteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEstudiantes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarEstudiantes }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarEstudiantes")
    public JAXBElement<ListarEstudiantes> createListarEstudiantes(ListarEstudiantes value) {
        return new JAXBElement<>(_ListarEstudiantes_QNAME, ListarEstudiantes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEstudiantesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarEstudiantesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarEstudiantesResponse")
    public JAXBElement<ListarEstudiantesResponse> createListarEstudiantesResponse(ListarEstudiantesResponse value) {
        return new JAXBElement<>(_ListarEstudiantesResponse_QNAME, ListarEstudiantesResponse.class, null, value);
    }

}
