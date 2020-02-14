package com.gorajski.spring.basics.springinsteps.cdi;

import com.gorajski.spring.basics.springinsteps.SpringInStepsCDIApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeCDIBusinessTest {

    @Mock
    SomeCDIDAO daoMock;

    @InjectMocks
    SomeCDIBusiness business;

    @Test
    public void findGreatest_happyPath() {
        when(daoMock.getData()).thenReturn(new int[]{2,4});
        int result = business.findGreatest();
        assertEquals(4, result);
    }

    @Test
    public void findGreatest_emptyDaoResult() {
        when(daoMock.getData()).thenReturn(new int[]{});
        int result = business.findGreatest();
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    public void findGreatest_equalElements() {
        when(daoMock.getData()).thenReturn(new int[]{2,2});
        int result = business.findGreatest();
        assertEquals(2, result);
    }
}