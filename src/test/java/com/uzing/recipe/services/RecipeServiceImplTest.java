package com.uzing.recipe.services;

/**
 * Created by Xinjie on 2018/10/28 3:17 PM.
 */
//public class RecipeServiceImplTest {
//
//    RecipeServiceImpl recipeService;
//
//    @Mock
//    RecipeRepository recipeRepository;
//
//    @Before
//    public void setUp() throws Exception {
//        MockitoAnnotations.initMocks(this);
//
//        recipeService = new RecipeServiceImpl(recipeRepository);
//    }
//
//    @Test
//    public void getRecipes() {
//
//        Recipe recipe = new Recipe();
//        HashSet recipesData = new HashSet();
//        recipesData.add(recipe);
//
//        when(recipeService.getRecipes()).thenReturn(recipesData);
//
//        Set<Recipe> recipes = recipeService.getRecipes();
//        assertEquals(recipes.size(), 1);
//        verify(recipeRepository, times(1)).findAll();
//    }
//}