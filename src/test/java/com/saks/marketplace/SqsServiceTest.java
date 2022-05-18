// package com.saks.marketplace;
// 
// import com.saks.marketplace.handler.SqsService;
// import com.saks.marketplace.handler.impl.DefaultSqsService;
// import org.junit.Before;
// import org.junit.Test;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.MockitoAnnotations;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// 
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// 
// import static org.mockito.Mockito.mock;
// 
// /**
// * Default Http Service Test.
// */
// public class SqsServiceTest {
//    private static final Logger logger = LoggerFactory.getLogger(SqsServiceTest.class);
//    @Mock
//    SqsService sqsService = mock(SqsService.class);
// 
//    @InjectMocks
//    DefaultSqsService defaultSqsService = new DefaultSqsService();
// 
//    /**
//     * run before.
//     */
//    @Before
//    public void setup() {
//        MockitoAnnotations.openMocks(this);
//    }
// 
//    /**
//     * run test.
//     */
//    @Test
//    public void runTest() {
//        logger.debug("-----test start --------");
// 
//        //     defaultSqsService.send(messags);
//        defaultSqsService.receive();
//        logger.debug("-----test end --------");
//    }
// 
//    String getTime() {
//        final LocalDateTime myDateObj = LocalDateTime.now();
//        final DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
// 
//        final String formattedDate = myDateObj.format(myFormatObj);
//        return formattedDate;
//    }




