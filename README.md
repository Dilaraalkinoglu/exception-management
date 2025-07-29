# Exception Management

Spring Boot ile geliştirilmiş bu proje, global exception handling, zamanlanmış görevler (@Scheduled) ve unit test (JUnit) kullanımını örneklemektedir.

---

## 🚀 Proje Özellikleri

- ✅ Global Exception Handler ile hata yönetimi  
- ✅ Generic yapı ile esnek API error modeli  
- ✅ `@Scheduled` anotasyonu ile zamanlanmış görev çalıştırma  
- ✅ `@RestController` üzerinden veri çekme örneği  
- ✅ JUnit ile servis katmanı testleri  
- ✅ Spring Boot + Spring Data JPA + H2 (veya başka veritabanı) kullanımı

---

## 🧰 Kullanılan Teknolojiler

- Java 17+
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- H2 Database (veya PostgreSQL/MySQL)
- JUnit 5
- Maven
- Lombok (isteğe bağlı)

---

## 🔁 Endpoint Örneği

### Get Employee By ID

```http
GET /rest/api/employee/list/{id}
