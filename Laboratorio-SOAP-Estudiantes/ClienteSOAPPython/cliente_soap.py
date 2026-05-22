from zeep import Client

wsdl_url = "http://localhost:8080/ServicioSOAPVideo/EstudiantesWS?wsdl"

try:
    client = Client(wsdl=wsdl_url)
    
    print("--- Insertando estudiante desde la App Python ---")
    respuesta = client.service.insertarEstudiante("Esteban", "Quito", "0999999999")
    print("Respuesta del servidor:", respuesta)
    
    print("\n--- Consultando la lista desde la App Python ---")
    estudiantes = client.service.listarEstudiantes()
    for est in estudiantes:
        print(est)

except Exception as e:
    print("Error en la comunicación SOAP:", e)