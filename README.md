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
Usually you are going to use the Java Configuration for beans of things that you are importing like Hibernate and data sources and things like that.So where you dont have the actual source code but Im using this as a configuration because spring really doesnt know the difference as to whether or not you have something coming in from a jar or if it's coming from a source control that you actually have control of.

@Bean
this is the instance
