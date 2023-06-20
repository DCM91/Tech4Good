import { Layout } from '@/components/Layout'
import { Barris } from '@/components/Barris'

import React from 'react'

export default function mercatsFires() {
  return (
    <Layout title="Tech4good - Mercats i Fires">
        <div className='text-2xl'>Mercats Fires</div>
        <div className='flex w-100 py-5 px-10'>
          <Barris />
        </div>
    </Layout>

  )
}
