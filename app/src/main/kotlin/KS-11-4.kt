package org.example.app

class Category(
    val id: Int,
    val name: String,
    val imageUrl: String,

)

class Recipe(
    val id: Int,
    val categoryId: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val cookingTime: Int,
    val servings: Int,
    val instructions: String,
)
class Ingredient(
    val id: Int,
    val recipeId: Int,
    val name: String,
    val quantity: String
)
    fun main() {
        val category = Category(
            id = 1,
            name = "Завтраки",
            imageUrl = "breakfast.jpg"
        )

        // Создаем рецепт
        val recipe = Recipe(
            id = 1,
            categoryId = category.id,
            name = "Омлет",
            description = "Классический омлет с молоком",
            imageUrl = "omlet.jpg",
            cookingTime = 10,
            servings = 2,
            instructions = "1. Взбить яйца с молоком\n2. Посолить\n3. Жарить на сковороде до готовности"
        )


        val ingredients = listOf(
            Ingredient(
                id = 1,
                recipeId = recipe.id,
                name = "Яйца",
                quantity = "3 шт."
            ),
            Ingredient(
                id = 2,
                recipeId = recipe.id,
                name = "Молоко",
                quantity = "50 мл"
            ),
            Ingredient(
                id = 3,
                recipeId = recipe.id,
                name = "Соль",
                quantity = "щепотка"
            )
        )

        // Выводим информацию
        println("=== КАТЕГОРИЯ ===")
        println("ID: ${category.id}")
        println("Название: ${category.name}")
        println("Изображение: ${category.imageUrl}")
        println()

        println("=== РЕЦЕПТ ===")
        println("ID: ${recipe.id}")
        println("Название: ${recipe.name}")
        println("Описание: ${recipe.description}")
        println("Изображение: ${recipe.imageUrl}")
        println("Время приготовления: ${recipe.cookingTime} мин")
        println("Порций: ${recipe.servings}")
        println("Инструкции:\n${recipe.instructions}")
        println()

        println("=== ИНГРЕДИЕНТЫ ===")
        ingredients.forEach { ingredient ->
            println("- ${ingredient.name}: ${ingredient.quantity}")
        }
    }

