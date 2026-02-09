import { ref } from 'vue';

export function useAsyncTask<T>() {
  const loading = ref(false);
  const errorMessage = ref('');
  const data = ref<T | null>(null);

  async function run(task: () => Promise<T>) {
    loading.value = true;
    errorMessage.value = '';
    try {
      data.value = await task();
      return data.value;
    } catch (error) {
      errorMessage.value = error instanceof Error ? error.message : 'Unknown error';
      throw error;
    } finally {
      loading.value = false;
    }
  }

  return {
    loading,
    errorMessage,
    data,
    run
  };
}
