# android-compose-collectAsState-with-navigate

## Prerequisites

Repository(DataSource) provides not `StateFlow<T>` but `Flow<T>` API.

## Bad pattern 1

call `collectAsFlow()` to `Flow<T>` with initial value.

When dataSource emits new value, only `LaunchedEffect` is called and no composable is displayed..

## Bad pattern 2

collect value from dataSource and put it to another `MutableStateFlow<T>`

## Good pattern

collect value in `LaunchedEffect(Unit)`. We must read the Javadoc of `LaunchedEffect()`... 
