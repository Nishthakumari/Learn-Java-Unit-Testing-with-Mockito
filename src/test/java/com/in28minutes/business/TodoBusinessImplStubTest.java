package com.in28minutes.business;

import com.in28minutes.data.api.TodoService;
import com.in28minutes.data.api.TodoServiceStub;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoBusinessImplStubTest {

    @Test
    public void test()
    {
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceStub);

        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2, filteredTodos.size());
    }
}
