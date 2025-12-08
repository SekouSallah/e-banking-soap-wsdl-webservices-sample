
package dev.sekousow.ebankingclient.proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dev.sekousow.ebankingclient.proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ConvertEuroToDirham_QNAME = new QName("http://sekousow.dev/ebanking", "ConvertEuroToDirham");
    private static final QName _ConvertEuroToDirhamResponse_QNAME = new QName("http://sekousow.dev/ebanking", "ConvertEuroToDirhamResponse");
    private static final QName _CreateAccount_QNAME = new QName("http://sekousow.dev/ebanking", "CreateAccount");
    private static final QName _CreateAccountResponse_QNAME = new QName("http://sekousow.dev/ebanking", "CreateAccountResponse");
    private static final QName _GetAllAccounts_QNAME = new QName("http://sekousow.dev/ebanking", "GetAllAccounts");
    private static final QName _GetAllAccountsResponse_QNAME = new QName("http://sekousow.dev/ebanking", "GetAllAccountsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dev.sekousow.ebankingclient.proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertEuroToDirham }
     * 
     * @return
     *     the new instance of {@link ConvertEuroToDirham }
     */
    public ConvertEuroToDirham createConvertEuroToDirham() {
        return new ConvertEuroToDirham();
    }

    /**
     * Create an instance of {@link ConvertEuroToDirhamResponse }
     * 
     * @return
     *     the new instance of {@link ConvertEuroToDirhamResponse }
     */
    public ConvertEuroToDirhamResponse createConvertEuroToDirhamResponse() {
        return new ConvertEuroToDirhamResponse();
    }

    /**
     * Create an instance of {@link CreateAccount }
     * 
     * @return
     *     the new instance of {@link CreateAccount }
     */
    public CreateAccount createCreateAccount() {
        return new CreateAccount();
    }

    /**
     * Create an instance of {@link CreateAccountResponse }
     * 
     * @return
     *     the new instance of {@link CreateAccountResponse }
     */
    public CreateAccountResponse createCreateAccountResponse() {
        return new CreateAccountResponse();
    }

    /**
     * Create an instance of {@link GetAllAccounts }
     * 
     * @return
     *     the new instance of {@link GetAllAccounts }
     */
    public GetAllAccounts createGetAllAccounts() {
        return new GetAllAccounts();
    }

    /**
     * Create an instance of {@link GetAllAccountsResponse }
     * 
     * @return
     *     the new instance of {@link GetAllAccountsResponse }
     */
    public GetAllAccountsResponse createGetAllAccountsResponse() {
        return new GetAllAccountsResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     * @return
     *     the new instance of {@link Account }
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDirham }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDirham }{@code >}
     */
    @XmlElementDecl(namespace = "http://sekousow.dev/ebanking", name = "ConvertEuroToDirham")
    public JAXBElement<ConvertEuroToDirham> createConvertEuroToDirham(ConvertEuroToDirham value) {
        return new JAXBElement<>(_ConvertEuroToDirham_QNAME, ConvertEuroToDirham.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDirhamResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDirhamResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sekousow.dev/ebanking", name = "ConvertEuroToDirhamResponse")
    public JAXBElement<ConvertEuroToDirhamResponse> createConvertEuroToDirhamResponse(ConvertEuroToDirhamResponse value) {
        return new JAXBElement<>(_ConvertEuroToDirhamResponse_QNAME, ConvertEuroToDirhamResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://sekousow.dev/ebanking", name = "CreateAccount")
    public JAXBElement<CreateAccount> createCreateAccount(CreateAccount value) {
        return new JAXBElement<>(_CreateAccount_QNAME, CreateAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sekousow.dev/ebanking", name = "CreateAccountResponse")
    public JAXBElement<CreateAccountResponse> createCreateAccountResponse(CreateAccountResponse value) {
        return new JAXBElement<>(_CreateAccountResponse_QNAME, CreateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccounts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllAccounts }{@code >}
     */
    @XmlElementDecl(namespace = "http://sekousow.dev/ebanking", name = "GetAllAccounts")
    public JAXBElement<GetAllAccounts> createGetAllAccounts(GetAllAccounts value) {
        return new JAXBElement<>(_GetAllAccounts_QNAME, GetAllAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccountsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllAccountsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sekousow.dev/ebanking", name = "GetAllAccountsResponse")
    public JAXBElement<GetAllAccountsResponse> createGetAllAccountsResponse(GetAllAccountsResponse value) {
        return new JAXBElement<>(_GetAllAccountsResponse_QNAME, GetAllAccountsResponse.class, null, value);
    }

}
