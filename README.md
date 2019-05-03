#Spring Core
@Profile 
when there are multiple Impl class and all are @Component and all are implementing same interface then in this case if we use 
setter injection or contructor injection, then the container will not be able to determine which bean to refer and therefore exception will be raised so in this case we us @Profile.
In Application.properties we can set spring.profiles.active=spanish or english whichever you have defined in the service class
as the profile.
There is also another way how you can resolve this issue of ambiguity that is by using @Profile("default"), In this case the @Autowired will pickup the default on (@Profile("default"))
Or You can also use  @Profile({"default","english"}) both at same time.

@ComponentScan
By default in Spring the container will scan the components in its own package,so in such case in which the controller,services and other components are in differnt package then the Spring container will not be able to find these
component and there will be exception.So in this case when the packages are different then we can explicitly mention the package name of the component so that the container can scan appropitate package and can generate respective beans.
and for this we use @ComponentScan. eg @ComponentScan("guru.springframework").

@Configuration
This is when the souce code is not fully exposed to us that is when we are using a jar and want to create a object for using the class method.

@Bean
this is the instance
