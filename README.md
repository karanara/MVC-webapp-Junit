junit testing with spring mvc ,database

For any MVC Spring App, we use TDD approach to build Service and DAO. 
Now for sample testing we are using H2 in memory database
1.Needed initialization by inserting sample data before each test.
2.Deletion of sample data after test.--@beforeEach @AfterEach
**Spring Testing Support**:
   1.To support for Web,RestAPIS we use mock object
   2.MockMvc -to test controllers
   3.@AutoConfigureMockMvc -- annotation for test using mockito framework
   4.Inject MockMvc -- for injetcing controller
   5.We can insert data into sql for testing purposes in before each by wrirting the sql code in the way we used for SQL database
   6.But for more optimized and refactoring--- we can write those queries in application.properties by sql.create.insert.tablename; and inject those values as private string with @Value notation.
   
